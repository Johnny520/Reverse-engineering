package p001;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Reads the recovered configuration snapshot as plain UTF-8 JSON.
 *
 * The files are delivered in the sibling plaintext-config directory. No
 * ciphertext transformation is performed in this source snapshot.
 */
public final class PlaintextConfigSnapshot {

    private static final String CONFIG_DIRECTORY = "plaintext-config";

    private PlaintextConfigSnapshot() {
    }

    public static String get(String fileName) {
        File file = new File(CONFIG_DIRECTORY, fileName);
        try (InputStream input = new FileInputStream(file);
             ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int count;
            while ((count = input.read(buffer)) != -1) {
                output.write(buffer, 0, count);
            }
            return new String(output.toByteArray(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException("Missing plaintext configuration: " + file.getPath(), e);
        }
    }

    public static String getAppConfig(String version) {
        String normalized = version.startsWith("a") ? version : "a" + version;
        return get(normalized + ".json");
    }
}
