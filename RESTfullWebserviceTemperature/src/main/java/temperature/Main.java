package temperature;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vladimir Kiva
 * 
 * Используя Spring Boot, сделать веб-приложение, которое принимает 
 * REST-подобный HTTP запрос, где передаётся название города (например "Moscow") 
 * и код страны (например "ru"), и возвращает текущую температуру в этом городе 
 * и минимальную из прогнозируемых температур в ближайшие 3 дня в JSON формате.
 * Для сборки приложения использовать Maven или Gradle.
 * Приложение должно быть самодостаточным, запускаться из командной строки и не 
 * требовать отдельно установленных servlet контейнеров, application серверов и т.п.
 * 
 * Запрос имеет такой формат: http://localhost:8080/temperature?city=Moscow&country=ru
 * Формат ответа: {"temp":17.19,"temp_min":12.58}
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
	
	private Float temp;
	private Float temp_min;
	
	public Main() {
    }
	
    public Float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(Float temp_min) {
		this.temp_min = temp_min;
	}

    public Float getTemp() {
        return this.temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }
}
