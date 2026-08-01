import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DecodeM515 {
    private static final long[] POW = new long[] {
            0x62a9d9ed799705f5L,
            0xcb24d0a5c88c35b3L
    };

    private final String[] f773;

    private DecodeM515(String[] f773) {
        this.f773 = f773;
    }

    public static void main(String[] args) throws Exception {
        if (args.length >= 2 && "--rewrite".equals(args[0])) {
            Path root = Path.of(args[1]);
            rewriteTree(root);
            return;
        }

        Path src = Path.of(args.length > 0 ? args[0] : "0629161700-release-decompiled/sources/defpackage/AbstractC0069.java");
        String[] table = loadTable(src);
        DecodeM515 dec = new DecodeM515(table);
        if (args.length > 1) {
            for (int i = 1; i < args.length; i++) {
                long v = Long.parseLong(args[i]);
                String s = dec.m515(v);
                System.out.println(v + " -> " + s);
            }
            return;
        }
        long[] samples = new long[] {
                -830432211279406L,
                -830462276050478L,
                -718775946485294L,
                -718806011256366L,
                -718672867270190L,
                -396378521378350L,
                -396425766018606L,
                -396464420724270L,
                -474551221132846L
        };
        for (long v : samples) {
            System.out.println(v + " -> " + dec.m515(v));
        }
    }

    private static void rewriteTree(Path root) throws Exception {
        Path sourcesRoot = root.resolve("sources");
        String[] table = loadTable(sourcesRoot.resolve("defpackage").resolve("AbstractC0069.java"));
        DecodeM515 dec = new DecodeM515(table);

        long files = 0;
        long replacements = 0;
        long dropped = 0;
        try (var stream = Files.walk(sourcesRoot)) {
            for (Path p : stream.filter(Files::isRegularFile).filter(x -> x.toString().endsWith(".java")).toList()) {
                RewriteResult rr = dec.rewriteFile(p);
                if (rr.changed) {
                    Files.writeString(p, rr.text, StandardCharsets.UTF_8);
                }
                files++;
                replacements += rr.replacements;
                dropped += rr.droppedStandaloneCalls;
            }
        }
        System.out.println("rewritten_files=" + files);
        System.out.println("m515_replacements=" + replacements);
        System.out.println("m515_dropped_calls=" + dropped);
    }

    private static final class RewriteResult {
        final String text;
        final long replacements;
        final long droppedStandaloneCalls;
        final boolean changed;

        RewriteResult(String text, long replacements, long droppedStandaloneCalls, boolean changed) {
            this.text = text;
            this.replacements = replacements;
            this.droppedStandaloneCalls = droppedStandaloneCalls;
            this.changed = changed;
        }
    }

    private RewriteResult rewriteFile(Path file) throws Exception {
        List<String> in = Files.readAllLines(file, StandardCharsets.UTF_8);
        List<String> out = new ArrayList<>(in.size());
        Map<String, Long> consts = new HashMap<>();
        long replacements = 0;
        long dropped = 0;

        for (String line : in) {
            String trimmed = line.trim();
            if (looksLikeMethodStart(trimmed) || "static {".equals(trimmed)) {
                consts.clear();
            }

            String rewritten = replaceM515Calls(line, consts);
            if (rewritten == null) {
                dropped++;
                continue;
            }
            rewritten = replaceAbstractC0225Calls(rewritten, consts);
            if (!rewritten.equals(line)) {
                replacements += countOccurrences(line, "AbstractC0069.m515(")
                        + countOccurrences(line, "m515(")
                        + countOccurrences(line, "defpackage.AbstractC0225.m813(")
                        + countOccurrences(line, "defpackage.AbstractC0225.m814(")
                        + countOccurrences(line, "defpackage.AbstractC0225.m815(")
                        + countOccurrences(line, "defpackage.AbstractC0225.m816(")
                        + countOccurrences(line, "AbstractC0225.m813(")
                        + countOccurrences(line, "AbstractC0225.m814(")
                        + countOccurrences(line, "AbstractC0225.m815(")
                        + countOccurrences(line, "AbstractC0225.m816(");
            }
            updateConstEnv(rewritten, consts);
            out.add(rewritten);
        }

        String text = String.join(System.lineSeparator(), out) + System.lineSeparator();
        boolean changed = !text.equals(String.join(System.lineSeparator(), in) + System.lineSeparator());
        return new RewriteResult(text, replacements, dropped, changed);
    }

    private static boolean looksLikeMethodStart(String trimmed) {
        if (trimmed.startsWith("static {")) return true;
        if (!trimmed.endsWith("{")) return false;
        if (trimmed.startsWith("if ")) return false;
        if (trimmed.startsWith("if(")) return false;
        if (trimmed.startsWith("for ")) return false;
        if (trimmed.startsWith("for(")) return false;
        if (trimmed.startsWith("while ")) return false;
        if (trimmed.startsWith("while(")) return false;
        if (trimmed.startsWith("switch ")) return false;
        if (trimmed.startsWith("switch(")) return false;
        if (trimmed.startsWith("catch ")) return false;
        if (trimmed.startsWith("try ")) return false;
        if (trimmed.startsWith("else ")) return false;
        return (trimmed.startsWith("public ")
                || trimmed.startsWith("private ")
                || trimmed.startsWith("protected ")
                || trimmed.startsWith("final ")
                || trimmed.startsWith("static ")
                || trimmed.startsWith("native ")
                || trimmed.startsWith("abstract ")
                || trimmed.startsWith("synchronized ")
                || trimmed.startsWith("strictfp "));
    }

    private String replaceM515Calls(String line, Map<String, Long> consts) {
        StringBuilder out = new StringBuilder(line.length() + 32);
        int i = 0;
        boolean changed = false;
        boolean hadDecryptedCall = false;
        while (i < line.length()) {
            int idx = line.indexOf("m515(", i);
            if (idx < 0) {
                out.append(line, i, line.length());
                break;
            }
            out.append(line, i, idx);
            int open = idx + 4;
            int close = findMatchingParen(line, open);
            if (close < 0) {
                out.append(line, idx, line.length());
                break;
            }
            String arg = line.substring(open + 1, close).trim();
            Long v = resolveLong(arg, consts);
            if (v != null) {
                try {
                    String decoded = decode(v);
                    out.append('"').append(escapeJava(decoded)).append('"');
                    changed = true;
                    hadDecryptedCall = true;
                } catch (RuntimeException ex) {
                    out.append(line, idx, close + 1);
                }
            } else {
                out.append(line, idx, close + 1);
            }
            i = close + 1;
        }
        if (!changed) {
            return line;
        }
        String rewritten = out.toString();
        if (isStandaloneM515Line(line.trim(), hadDecryptedCall)) {
            return null;
        }
        return rewritten;
    }

    private static boolean isStandaloneM515Line(String trimmed, boolean hadDecryptedCall) {
        if (!hadDecryptedCall) return false;
        if (trimmed.startsWith("defpackage.AbstractC0069.m515(") || trimmed.startsWith("AbstractC0069.m515(") || trimmed.startsWith("m515(")) {
            return true;
        }
        return false;
    }

    private String replaceAbstractC0225Calls(String line, Map<String, Long> consts) {
        String indent = line.substring(0, line.length() - line.trim().length());
        String trimmed = line.trim();

        String[] methods = {"m813", "m814", "m815", "m816"};
        for (String methodName : methods) {
            int callStart = indexOfAny(trimmed,
                    "defpackage.AbstractC0225." + methodName + "(",
                    "AbstractC0225." + methodName + "(");
            if (callStart < 0) {
                continue;
            }
            int open = trimmed.indexOf('(', callStart);
            if (open < 0) {
                return line;
            }
            int close = findMatchingParen(trimmed, open);
            if (close < 0) {
                return line;
            }
            String[] parts = splitArgs(trimmed.substring(open + 1, close));
            String prefix = trimmed.substring(0, callStart).trim();

            if ("m813".equals(methodName)) {
                if (parts.length != 3) return line;
                Long v = resolveLong(parts[2], consts);
                if (v == null) return line;
                String decoded = escapeJava(decode(v));
                return indent
                        + parts[0].trim() + ".append(" + parts[1].trim() + ")" + System.lineSeparator()
                        + indent + parts[0].trim() + ".append(\"" + decoded + "\")";
            }

            if ("m815".equals(methodName)) {
                if (parts.length != 3) return line;
                Long v = resolveLong(parts[2], consts);
                if (v == null) return line;
                String decoded = escapeJava(decode(v));
                return indent
                        + parts[0].trim() + ".append(" + parts[1].trim() + ")" + System.lineSeparator()
                        + indent + parts[0].trim() + ".append(\"" + decoded + "\")";
            }

            if ("m814".equals(methodName)) {
                if (parts.length != 3) return line;
                Long v = resolveLong(parts[2], consts);
                if (v == null) return line;
                String decoded = escapeJava(decode(v));
                String assignment = prefix.isEmpty() ? "" : prefix + " ";
                return indent
                        + parts[0].trim() + ".append(" + parts[1].trim() + ")" + System.lineSeparator()
                        + indent + parts[0].trim() + ".append(\"" + decoded + "\")" + System.lineSeparator()
                        + indent + assignment + parts[0].trim() + ".toString()";
            }

            if ("m816".equals(methodName)) {
                if (parts.length != 2) return line;
                Long v = resolveLong(parts[0], consts);
                if (v == null) return line;
                String decoded = escapeJava(decode(v));
                String assignment = prefix.isEmpty() ? "" : prefix + " ";
                return indent + assignment + "defpackage.C1500.m2704(\"" + decoded + "\")";
            }
        }
        return line;
    }

    private static int indexOfAny(String line, String... needles) {
        int best = -1;
        for (String needle : needles) {
            int idx = line.indexOf(needle);
            if (idx >= 0 && (best < 0 || idx < best)) {
                best = idx;
            }
        }
        return best;
    }

    private static String[] splitArgs(String args) {
        List<String> out = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        int depth = 0;
        boolean inStr = false;
        boolean esc = false;
        for (int i = 0; i < args.length(); i++) {
            char c = args.charAt(i);
            if (inStr) {
                cur.append(c);
                if (esc) {
                    esc = false;
                } else if (c == '\\') {
                    esc = true;
                } else if (c == '"') {
                    inStr = false;
                }
                continue;
            }
            if (c == '"') {
                inStr = true;
                cur.append(c);
                continue;
            }
            if (c == '(') depth++;
            if (c == ')') depth--;
            if (c == ',' && depth == 0) {
                out.add(cur.toString().trim());
                cur.setLength(0);
                continue;
            }
            cur.append(c);
        }
        String last = cur.toString().trim();
        if (!last.isEmpty()) {
            out.add(last);
        }
        return out.toArray(String[]::new);
    }

    private static String escapeJava(String s) {
        StringBuilder out = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '\\' -> out.append("\\\\");
                case '"' -> out.append("\\\"");
                case '\b' -> out.append("\\b");
                case '\t' -> out.append("\\t");
                case '\n' -> out.append("\\n");
                case '\f' -> out.append("\\f");
                case '\r' -> out.append("\\r");
                default -> out.append(c);
            }
        }
        return out.toString();
    }

    private Long resolveLong(String expr, Map<String, Long> consts) {
        expr = expr.trim();
        expr = stripWrappers(expr);
        if (consts.containsKey(expr)) {
            return consts.get(expr);
        }
        Long direct = parseLongLiteral(expr);
        if (direct != null) {
            return direct;
        }
        if (expr.startsWith("(long)") || expr.startsWith("(int)") || expr.startsWith("(short)") || expr.startsWith("(byte)") || expr.startsWith("(char)") || expr.startsWith("(boolean)")) {
            return resolveLong(expr.substring(expr.indexOf(')') + 1), consts);
        }
        return null;
    }

    private static Long parseLongLiteral(String expr) {
        String s = expr.trim();
        if (s.isEmpty()) return null;
        if (s.startsWith("(") && s.endsWith(")") && s.indexOf(' ') > 0) {
            s = s.substring(s.lastIndexOf(')') + 1).trim();
        }
        int cut = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && (c == '+' || c == '-')) continue;
            if (Character.isDigit(c)) continue;
            if (i == 1 && s.startsWith("0x")) continue;
            if ((c == 'x' || c == 'X') && i == 1 && s.charAt(0) == '0') continue;
            cut = i;
            break;
        }
        String token = s.substring(0, cut);
        if (token.isEmpty() || token.equals("+") || token.equals("-")) return null;
        if (token.endsWith("L") || token.endsWith("l") || token.endsWith("D") || token.endsWith("d") || token.endsWith("F") || token.endsWith("f")) {
            token = token.substring(0, token.length() - 1);
        }
        try {
            if (token.startsWith("0x") || token.startsWith("0X") || token.startsWith("-0x") || token.startsWith("-0X") || token.startsWith("+0x") || token.startsWith("+0X")) {
                return Long.decode(token);
            }
            return Long.parseLong(token);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static String stripWrappers(String expr) {
        String s = expr.trim();
        while (true) {
            String next = s;
            if (next.startsWith("(") && next.endsWith(")") && balancedParens(next)) {
                next = next.substring(1, next.length() - 1).trim();
            }
            next = next.replaceFirst("^\\((?:long|int|short|byte|char|boolean)\\)\\s*", "");
            next = next.replaceFirst("^\\(\\s*(?:long|int|short|byte|char|boolean)\\s*\\)\\s*", "");
            if (next.equals(s)) {
                return next;
            }
            s = next;
        }
    }

    private static boolean balancedParens(String s) {
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') depth++;
            else if (c == ')') {
                depth--;
                if (depth < 0) return false;
                if (depth == 0 && i < s.length() - 1) return false;
            }
        }
        return depth == 0;
    }

    private static int findMatchingParen(String line, int openIdx) {
        int depth = 0;
        boolean inStr = false;
        boolean esc = false;
        for (int i = openIdx; i < line.length(); i++) {
            char c = line.charAt(i);
            if (inStr) {
                if (esc) {
                    esc = false;
                } else if (c == '\\') {
                    esc = true;
                } else if (c == '"') {
                    inStr = false;
                }
                continue;
            }
            if (c == '"') {
                inStr = true;
                continue;
            }
            if (c == '(') depth++;
            else if (c == ')') {
                depth--;
                if (depth == 0) return i;
            }
        }
        return -1;
    }

    private void updateConstEnv(String line, Map<String, Long> consts) {
        String trimmed = line.trim();
        if (trimmed.isEmpty() || trimmed.startsWith("//")) return;
        int eq = trimmed.indexOf('=');
        if (eq < 0) return;
        String lhs = trimmed.substring(0, eq).trim();
        String rhs = trimmed.substring(eq + 1).trim();
        if (lhs.contains(" ")) {
            lhs = lhs.substring(lhs.lastIndexOf(' ') + 1).trim();
        }
        if (!lhs.matches("r\\d+")) return;

        Long rhsConst = resolveLong(rhs, consts);
        if (rhsConst != null) {
            consts.put(lhs, rhsConst);
            return;
        }
        if (rhs.matches("r\\d+")) {
            Long copy = consts.get(rhs);
            if (copy != null) {
                consts.put(lhs, copy);
                return;
            }
        }
        consts.remove(lhs);
    }

    private static int countOccurrences(String text, String needle) {
        int count = 0;
        int idx = 0;
        while ((idx = text.indexOf(needle, idx)) >= 0) {
            count++;
            idx += needle.length();
        }
        return count;
    }

    private String decode(long v) {
        if (f773 == null || f773.length == 0) {
            throw new IllegalStateException("string table not loaded");
        }
        long r0 = u32(v);
        long r2 = r0 >>> 33;
        r0 ^= r2;
        r0 *= POW[0];
        r2 = r0 >>> 28;
        r0 ^= r2;
        r0 *= POW[1];
        r0 >>>= 32;
        long t = m3256(r0);
        long r3 = (t >>> 32) & 0xffffL;
        t = m3256(t);
        long r7 = (t >>> 16) & 0xffff0000L;
        v >>>= 32;
        v ^= r3;
        v ^= r7;
        int idx = (int) v;
        int rowIndex = Math.floorDiv(idx, 8191);
        int colIndex = Math.floorMod(idx, 8191);
        if (rowIndex < 0 || rowIndex >= f773.length) {
            throw new IllegalStateException("decoded index out of range: " + idx);
        }
        t = m3256(t);
        String row = f773[rowIndex];
        if (colIndex < 0 || colIndex >= row.length()) {
            throw new IllegalStateException("decoded column out of range: " + colIndex);
        }
        char c = row.charAt(colIndex);
        t ^= ((long) c) << 32;
        int len = (int) ((t >>> 32) & 0xffffL);
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            int pos = idx + i + 1;
            t = m3256(t);
            int segIndex = Math.floorDiv(pos, 8191);
            int segOffset = Math.floorMod(pos, 8191);
            if (segIndex < 0 || segIndex >= f773.length) {
                throw new IllegalStateException("segment index out of range: " + segIndex);
            }
            String seg = f773[segIndex];
            if (segOffset < 0 || segOffset >= seg.length()) {
                throw new IllegalStateException("segment offset out of range: " + segOffset);
            }
            c = seg.charAt(segOffset);
            t ^= ((long) c) << 32;
            out[i] = (char) ((t >>> 32) & 0xffffL);
        }
        return new String(out);
    }

    private static String[] extractTable(String text) {
        int start = text.indexOf("static {");
        if (start < 0) throw new IllegalStateException("static block not found");
        int end = findMatchingBrace(text, start);
        String block = text.substring(start, end);
        List<String> vals = new ArrayList<>();
        for (String line : block.split("\\R")) {
            line = line.trim();
            if (!line.startsWith("java.lang.String r")) {
                continue;
            }
            int first = line.indexOf('"');
            int last = line.lastIndexOf('"');
            if (first < 0 || last <= first) {
                continue;
            }
            vals.add(javaUnescape(line.substring(first + 1, last)));
        }
        if (vals.size() != 42) {
            throw new IllegalStateException("expected 42 segments, got " + vals.size());
        }
        return vals.toArray(String[]::new);
    }

    private static String[] loadTable(Path sourceOrRoot) throws Exception {
        if (Files.isDirectory(sourceOrRoot)) {
            Path json = findTableJson(sourceOrRoot);
            if (json != null) {
                return parseJsonStringArray(Files.readString(json, StandardCharsets.UTF_8));
            }
            Path candidate = sourceOrRoot.resolve("sources").resolve("defpackage").resolve("AbstractC0069.java");
            if (Files.isRegularFile(candidate)) {
                String text = Files.readString(candidate, StandardCharsets.UTF_8);
                try {
                    return extractTable(text);
                } catch (IllegalStateException ignored) {
                    // fall through
                }
            }
            throw new IllegalStateException("string table not found under " + sourceOrRoot);
        }

        if (Files.isRegularFile(sourceOrRoot)) {
            String text = Files.readString(sourceOrRoot, StandardCharsets.UTF_8);
            try {
                return extractTable(text);
            } catch (IllegalStateException ignored) {
                // fall through to JSON search
            }
        }

        Path json = findTableJson(sourceOrRoot);
        if (json != null) {
            return parseJsonStringArray(Files.readString(json, StandardCharsets.UTF_8));
        }
        throw new IllegalStateException("string table not found for " + sourceOrRoot);
    }

    private static Path findTableJson(Path start) {
        Path dir = Files.isDirectory(start) ? start : start.getParent();
        while (dir != null) {
            Path candidate = dir.resolve("f773_strings.json");
            if (Files.isRegularFile(candidate)) {
                return candidate;
            }
            dir = dir.getParent();
        }
        return null;
    }

    private static String[] parseJsonStringArray(String text) {
        List<String> vals = new ArrayList<>();
        int i = 0;
        int n = text.length();
        while (i < n && Character.isWhitespace(text.charAt(i))) i++;
        if (i >= n || text.charAt(i) != '[') {
            throw new IllegalStateException("json array expected");
        }
        i++;
        while (true) {
            while (i < n && Character.isWhitespace(text.charAt(i))) i++;
            if (i >= n) {
                throw new IllegalStateException("unexpected end of json");
            }
            char c = text.charAt(i);
            if (c == ']') {
                break;
            }
            if (c != '"') {
                throw new IllegalStateException("expected string at index " + i);
            }
            i++;
            StringBuilder raw = new StringBuilder();
            boolean esc = false;
            while (i < n) {
                c = text.charAt(i++);
                if (esc) {
                    raw.append('\\').append(c);
                    esc = false;
                    continue;
                }
                if (c == '\\') {
                    esc = true;
                    continue;
                }
                if (c == '"') {
                    break;
                }
                raw.append(c);
            }
            if (esc) {
                throw new IllegalStateException("trailing escape in json string");
            }
            vals.add(javaUnescape(raw.toString()));
            while (i < n && Character.isWhitespace(text.charAt(i))) i++;
            if (i >= n) {
                throw new IllegalStateException("unexpected end after string");
            }
            c = text.charAt(i);
            if (c == ',') {
                i++;
                continue;
            }
            if (c == ']') {
                break;
            }
            throw new IllegalStateException("expected ',' or ']' at index " + i);
        }
        if (vals.size() != 42) {
            throw new IllegalStateException("expected 42 segments, got " + vals.size());
        }
        return vals.toArray(String[]::new);
    }

    private static int findMatchingBrace(String text, int start) {
        boolean inStr = false, esc = false, line = false, block = false, begun = false;
        int depth = 0;
        for (int i = start; i < text.length(); i++) {
            char c = text.charAt(i);
            char n = i + 1 < text.length() ? text.charAt(i + 1) : 0;
            if (line) {
                if (c == '\n') line = false;
                continue;
            }
            if (block) {
                if (c == '*' && n == '/') {
                    block = false;
                    i++;
                }
                continue;
            }
            if (inStr) {
                if (esc) {
                    esc = false;
                } else if (c == '\\') {
                    esc = true;
                } else if (c == '"') {
                    inStr = false;
                }
                continue;
            }
            if (c == '/' && n == '/') {
                line = true;
                i++;
                continue;
            }
            if (c == '/' && n == '*') {
                block = true;
                i++;
                continue;
            }
            if (c == '"') {
                inStr = true;
                continue;
            }
            if (c == '{') {
                depth++;
                begun = true;
            } else if (c == '}') {
                depth--;
                if (begun && depth == 0) {
                    return i + 1;
                }
            }
        }
        throw new IllegalStateException("matching brace not found");
    }

    private static String javaUnescape(String s) {
        StringBuilder out = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if (c != '\\') {
                out.append(c);
                i++;
                continue;
            }
            if (i + 1 >= s.length()) {
                out.append('\\');
                break;
            }
            char n = s.charAt(i + 1);
            if (n == 'u') {
                int j = i + 2;
                while (j < s.length() && s.charAt(j) == 'u') j++;
                int cp = Integer.parseInt(s.substring(j, j + 4), 16);
                out.append((char) cp);
                i = j + 4;
            } else {
                switch (n) {
                    case 'b' -> out.append('\b');
                    case 't' -> out.append('\t');
                    case 'n' -> out.append('\n');
                    case 'f' -> out.append('\f');
                    case 'r' -> out.append('\r');
                    case '"' -> out.append('"');
                    case '\'' -> out.append('\'');
                    case '\\' -> out.append('\\');
                    default -> out.append(n);
                }
                i += 2;
            }
        }
        return out.toString();
    }

    private static short s16(int v) {
        return (short) v;
    }

    private static long u32(long v) {
        return v & 0xffffffffL;
    }

    private static long m3256(long r4) {
        long r0 = 65535L;
        long r2 = r4 & r0;
        short s2 = (short) r2;
        r4 = (r4 >>> 16) & r0;
        short s4 = (short) r4;
        int r5 = s2 + s4;
        short s5 = (short) r5;
        int t0 = s5 << 9;
        int t1 = s5 >>> 23;
        s5 = (short) (t1 | t0);
        s5 = (short) (s5 + s2);
        s4 = (short) (s4 ^ s2);
        int u0 = s2 << 13;
        int u1 = s2 >>> 19;
        short s0 = (short) (u1 | u0);
        s0 = (short) (s0 ^ s4);
        s0 = (short) (s0 ^ (s4 << 5));
        int v0 = s4 << 10;
        int v1 = s4 >>> 22;
        s4 = (short) (v1 | v0);
        long out = (long) s4;
        out = out | (((long) s5) << 16);
        out = out << 16;
        out = out | (long) s0;
        return out;
    }

    public String m515(long r11) {
        long r0 = u32(r11);
        long r2 = r0 >>> 33;
        r0 ^= r2;
        r0 *= POW[0];
        r2 = r0 >>> 28;
        r0 ^= r2;
        r0 *= POW[1];
        r0 >>>= 32;
        long t = m3256(r0);
        long r3 = (t >>> 32) & 0xffffL;
        t = m3256(t);
        long r7 = (t >>> 16) & 0xffff0000L;
        r11 >>>= 32;
        r11 ^= r3;
        r11 ^= r7;
        int idx = (int) r11;
        t = m3256(t);
        String row = f773[Math.floorDiv(idx, 8191)];
        char c = row.charAt(Math.floorMod(idx, 8191));
        t ^= ((long) c) << 32;
        int len = (int) ((t >>> 32) & 0xffffL);
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            int pos = idx + i + 1;
            t = m3256(t);
            String seg = f773[Math.floorDiv(pos, 8191)];
            c = seg.charAt(Math.floorMod(pos, 8191));
            t ^= ((long) c) << 32;
            out[i] = (char) ((t >>> 32) & 0xffffL);
        }
        return new String(out);
    }
}
