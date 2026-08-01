use std::collections::BTreeMap;
use std::fs;
use std::io;
use std::path::{Path, PathBuf};

#[derive(Clone, Debug, Default)]
pub struct Config {
    values: BTreeMap<String, String>,
}

impl Config {
    pub fn load(path: &Path) -> io::Result<Self> {
        if !path.exists() {
            return Ok(Self::with_defaults());
        }
        let text = fs::read_to_string(path)?;
        let mut values = BTreeMap::new();
        for raw in text.lines() {
            let line = raw.trim();
            if line.is_empty() || line.starts_with('#') {
                continue;
            }
            let Some((key, value)) = line.split_once('=') else {
                continue;
            };
            let key = key.trim();
            if valid_key(key) {
                values.insert(key.to_owned(), value.trim().to_owned());
            }
        }
        let mut config = Self { values };
        config.add_defaults();
        Ok(config)
    }

    pub fn with_defaults() -> Self {
        let mut config = Self::default();
        config.add_defaults();
        config
    }

    fn add_defaults(&mut self) {
        for (key, value) in [
            ("zdyxmy", "off"),
            ("zdbl", "off"),
            ("zdgbkfq", "off"),
            ("spoof_boot", "on"),
            ("cleanup_external", "off"),
            ("daemon_interval_seconds", "30"),
        ] {
            self.values.entry(key.to_owned()).or_insert_with(|| value.to_owned());
        }
    }

    pub fn get(&self, key: &str) -> Option<&str> {
        self.values.get(key).map(String::as_str)
    }

    pub fn bool(&self, key: &str) -> bool {
        self.get(key).is_some_and(|value| matches!(value, "1" | "true" | "on" | "yes"))
    }

    pub fn integer(&self, key: &str, fallback: u64) -> u64 {
        self.get(key).and_then(|value| value.parse().ok()).unwrap_or(fallback)
    }

    pub fn set(&mut self, key: &str, value: &str) -> Result<(), String> {
        if !valid_key(key) {
            return Err(format!("invalid config key: {key}"));
        }
        if value.contains(['\r', '\n']) {
            return Err("config value contains a newline".to_owned());
        }
        self.values.insert(key.to_owned(), value.to_owned());
        Ok(())
    }

    pub fn save(&self, path: &Path) -> io::Result<()> {
        let parent = path.parent().unwrap_or_else(|| Path::new("."));
        fs::create_dir_all(parent)?;
        let temp = temp_path(path);
        let mut text = String::from("# YH_YC clean implementation configuration\n");
        for (key, value) in &self.values {
            text.push_str(key);
            text.push('=');
            text.push_str(value);
            text.push('\n');
        }
        fs::write(&temp, text)?;
        if path.exists() {
            fs::remove_file(path)?;
        }
        fs::rename(temp, path)
    }
}

fn valid_key(value: &str) -> bool {
    !value.is_empty() && value.bytes().all(|byte| byte.is_ascii_alphanumeric() || byte == b'_')
}

fn temp_path(path: &Path) -> PathBuf {
    let mut value = path.as_os_str().to_owned();
    value.push(format!(".tmp.{}", std::process::id()));
    PathBuf::from(value)
}

#[cfg(test)]
mod tests {
    use super::Config;
    use std::fs;

    #[test]
    fn round_trip_and_defaults() {
        let root = std::env::temp_dir().join(format!("yh-config-{}", std::process::id()));
        let path = root.join("conf/config.prop");
        let mut config = Config::with_defaults();
        config.set("zdyxmy", "on").unwrap();
        config.save(&path).unwrap();
        let loaded = Config::load(&path).unwrap();
        assert!(loaded.bool("zdyxmy"));
        assert_eq!(loaded.get("zdbl"), Some("off"));
        let _ = fs::remove_dir_all(root);
    }
}

