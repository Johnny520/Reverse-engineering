import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * Decrypts the obfuscated string pool in the AI抖音 (com.ss.android.ugc.aweme.yyds) Xposed module.
 *
 * Ports AbstractC0181.m745 (hash) and AbstractC2328.m4341 (string decrypt) from the
 * jadx-decompiled sources, parses the f11475 obfuscated string table, then walks every
 * .java file in the sources tree collecting m4341(<long>) call sites and decrypting each
 * unique key.
 */
public class DecryptStrings {

    private static String[] table;

    // Port of yyds.AbstractC0181.m745
    private static long m745(long j) {
        short s = (short) (j & 0xFFFF);
        short s2 = (short) ((j >>> 16) & 0xFFFF);
        short s3 = (short) (s + s2);
        short s4 = (short) (s2 ^ s);
        return ((((long) ((short) ((s4 >>> 22) | (s4 << 10))))
                | (((long) ((short) (((short) ((s3 >>> 23) | (s3 << 9))) + s))) << 16)) << 16)
                | ((long) ((short) (((short) (((short) ((s << 13) | (s >>> 19))) ^ s4)) ^ (s4 << 5))));
    }

    // Port of yyds.AbstractC2328.m4341
    private static String m4341(long j) {
        long j2 = 4294967295L & j;
        long j3 = (j2 ^ (j2 >>> 33)) * 7109453100751455733L;
        long jM745 = m745(((j3 ^ (j3 >>> 28)) * (-3808689974395783757L)) >>> 32);
        long j4 = (jM745 >>> 32) & 65535;
        long jM7452 = m745(jM745);
        int i = (int) (((j >>> 32) ^ j4) ^ ((jM7452 >>> 16) & (-65536)));
        long jM7453 = m745(jM7452);
        String[] strArr = table;
        long jCharAt = jM7453 ^ (((long) strArr[i / 8191].charAt(i % 8191)) << 32);
        int i2 = (int) ((jCharAt >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3 + 1;
            jCharAt = m745(jCharAt) ^ (((long) strArr[i4 / 8191].charAt(i4 % 8191)) << 32);
            cArr[i3] = (char) ((jCharAt >>> 32) & 65535);
        }
        return new String(cArr);
    }

    /**
     * Parses a Java string literal starting at the char following an opening quote.
     * Handles escaped quote, escaped backslash, unicode escapes (u-XXXX), newline,
     * tab, carriage-return, backspace, form-feed and octal escapes; returns the
     * decoded string and the index just past the closing quote.
     */
    private static String parseJavaString(String s, int start, int[] next) {
        StringBuilder sb = new StringBuilder();
        int i = start;
        int n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            if (c == '"') {
                next[0] = i + 1;
                return sb.toString();
            }
            if (c == '\\') {
                char e = s.charAt(i + 1);
                switch (e) {
                    case '"': sb.append('"'); i += 2; break;
                    case '\\': sb.append('\\'); i += 2; break;
                    case 'n': sb.append('\n'); i += 2; break;
                    case 't': sb.append('\t'); i += 2; break;
                    case 'r': sb.append('\r'); i += 2; break;
                    case 'b': sb.append('\b'); i += 2; break;
                    case 'f': sb.append('\f'); i += 2; break;
                    case 'u': {
                        sb.append((char) Integer.parseInt(s.substring(i + 2, i + 6), 16));
                        i += 6;
                        break;
                    }
                    case '0': case '1': case '2': case '3':
                    case '4': case '5': case '6': case '7': {
                        int end = i + 2;
                        while (end < i + 4 && end < n && s.charAt(end) >= '0' && s.charAt(end) <= '7') end++;
                        sb.append((char) Integer.parseInt(s.substring(i + 1, end), 8));
                        i = end;
                        break;
                    }
                    default:
                        sb.append(e); i += 2; break;
                }
            } else {
                sb.append(c);
                i++;
            }
        }
        next[0] = -1;
        return sb.toString();
    }

    /** Extracts the String[] literal bound to f11475 in AbstractC2328.java. */
    private static String[] parseTable(String fileText) {
        int idx = fileText.indexOf("f11475");
        if (idx < 0) throw new IllegalStateException("f11475 not found");
        int brace = fileText.indexOf("{", idx);
        int start = fileText.indexOf("\"", brace);
        List<String> list = new ArrayList<>();
        int[] next = new int[1];
        int p = start;
        while (p >= 0) {
            String tok = parseJavaString(fileText, p + 1, next);
            if (next[0] < 0) break;
            list.add(tok);
            p = next[0];
            // skip to next quote
            int q = fileText.indexOf("\"", p);
            if (q < 0) break;
            p = q;
        }
        return list.toArray(new String[0]);
    }

    private static final Pattern CALL = Pattern.compile("m4341\\s*\\(\\s*(-?\\d+)\\s*L?\\s*\\)");

    public static void main(String[] args) throws Exception {
        Path srcDir = Paths.get(args[0]);
        Path outFile = Paths.get(args[1]);

        // 1. parse the table
        String absFile = Files.readString(srcDir.resolve("yyds").resolve("AbstractC2328.java"), StandardCharsets.UTF_8);
        table = parseTable(absFile);
        System.out.println("Parsed " + table.length + " segments from f11475, total chars: "
                + Arrays.stream(table).mapToInt(String::length).sum());
        for (int k = 0; k < table.length; k++) {
            if (table[k].length() > 8191) {
                System.out.println("WARNING segment " + k + " length " + table[k].length() + " > 8191");
            }
        }

        // 2. collect all call sites
        Map<Long, List<String>> sites = new TreeMap<>();
        Files.walk(srcDir)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(p -> {
                    try {
                        String text = Files.readString(p, StandardCharsets.UTF_8);
                        Matcher m = CALL.matcher(text);
                        while (m.find()) {
                            long key = Long.parseLong(m.group(1));
                            sites.computeIfAbsent(key, k -> new ArrayList<>()).add(
                                    srcDir.relativize(p).toString().replace('\\', '/'));
                        }
                    } catch (IOException ignored) {}
                });
        System.out.println("Unique m4341 keys found: " + sites.size());

        // 3. decrypt each and write mapping
        StringBuilder sb = new StringBuilder();
        sb.append("# Decrypted strings (m4341 key -> value)\n");
        sb.append("# Format: <long> TAB <decrypted> TAB <first-3-usage-sites>\n");
        int failures = 0;
        for (Map.Entry<Long, List<String>> e : sites.entrySet()) {
            try {
                String dec = m4341(e.getKey());
                List<String> f = e.getValue();
                String siteStr = String.join(",", f.size() > 3 ? f.subList(0, 3) : f);
                sb.append(e.getKey()).append('\t').append(dec).append('\t').append(siteStr).append('\n');
            } catch (Exception ex) {
                failures++;
                sb.append(e.getKey()).append("\t<DECRYPT-FAILED: ").append(ex).append(">\n");
            }
        }
        Files.writeString(outFile, sb.toString(), StandardCharsets.UTF_8);
        System.out.println("Wrote " + outFile.toAbsolutePath() + "  (failures=" + failures + ")");
    }
}
