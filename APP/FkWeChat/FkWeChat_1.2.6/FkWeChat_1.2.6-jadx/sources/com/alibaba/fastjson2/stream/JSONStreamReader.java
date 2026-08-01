package com.alibaba.fastjson2.stream;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.stream.StreamReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONStreamReader<T> extends StreamReader<T> {
    protected ObjectReaderAdapter objectReader;

    public JSONStreamReader(ObjectReaderAdapter objectReaderAdapter) {
        this.objectReader = objectReaderAdapter;
    }

    /* JADX INFO: renamed from: of */
    public static JSONStreamReader m6429of(InputStream inputStream, Charset charset, Class cls) {
        ObjectReaderAdapter objectReaderAdapter = (ObjectReaderAdapter) JSONFactory.createReadContext().getObjectReader(cls);
        return (charset == StandardCharsets.UTF_16 || charset == StandardCharsets.UTF_16LE || charset == StandardCharsets.UTF_16BE) ? new JSONStreamReaderUTF16(new InputStreamReader(inputStream, charset), objectReaderAdapter) : new JSONStreamReaderUTF8(inputStream, charset, objectReaderAdapter);
    }

    public static void stat(StreamReader.ColumnStat columnStat, Object obj) {
        if (columnStat == null) {
            return;
        }
        if (obj == null) {
            columnStat.nulls++;
            return;
        }
        columnStat.values++;
        if (obj instanceof Number) {
            columnStat.numbers++;
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                columnStat.integers++;
                return;
            } else {
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    columnStat.doubles++;
                    return;
                }
                return;
            }
        }
        if (obj instanceof String) {
            columnStat.stat((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            columnStat.booleans++;
        } else if (obj instanceof Map) {
            columnStat.maps++;
        } else if (obj instanceof Collection) {
            columnStat.arrays++;
        }
    }

    private void statArray(String str, List list, int i10) {
        StringBuilder sb2;
        if (i10 <= 10 && list.size() <= 10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (str == null) {
                    sb2 = new StringBuilder("[");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("[");
                }
                sb2.append(i11);
                sb2.append("]");
                String string = sb2.toString();
                stat(getColumnStat(str), obj);
                if (obj instanceof Map) {
                    statMap(string, (Map) obj, i10 + 1);
                } else if (obj instanceof List) {
                    statArray(string, (List) obj, i10 + 1);
                }
            }
        }
    }

    private void statMap(String str, Map map, int i10) {
        if (i10 > 10) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                String str2 = str == null ? (String) key : str + "." + key;
                StreamReader.ColumnStat columnStat = getColumnStat(str2);
                Object value = entry.getValue();
                stat(columnStat, value);
                if (value instanceof Map) {
                    statMap(str2, (Map) value, i10 + 1);
                } else if (value instanceof List) {
                    statArray(str2, (List) value, i10 + 1);
                }
            }
        }
    }

    public StreamReader.ColumnStat getColumnStat(String str) {
        if (this.columnStatsMap == null) {
            this.columnStatsMap = new LinkedHashMap();
        }
        if (this.columns == null) {
            this.columns = new ArrayList();
        }
        if (this.columnStats == null) {
            this.columnStats = new ArrayList();
        }
        StreamReader.ColumnStat columnStat = this.columnStatsMap.get(str);
        if (columnStat != null || this.columnStatsMap.size() > 100) {
            return columnStat;
        }
        StreamReader.ColumnStat columnStat2 = new StreamReader.ColumnStat(str);
        this.columnStatsMap.put(str, columnStat2);
        this.columns.add(str);
        this.columnStats.add(columnStat2);
        return columnStat2;
    }

    public void statAll() {
        this.columnStatsMap = new LinkedHashMap();
        this.columns = new ArrayList();
        this.columnStats = new ArrayList();
        while (true) {
            T lineObject = readLineObject();
            if (lineObject == null) {
                return;
            } else {
                statLine(lineObject);
            }
        }
    }

    public void statLine(Object obj) {
        if (obj instanceof Map) {
            statMap(null, (Map) obj, 0);
        } else if (obj instanceof List) {
            statArray(null, (List) obj, 0);
        }
        this.rowCount++;
    }

    public JSONStreamReader(Type[] typeArr) {
        super(typeArr);
    }

    /* JADX INFO: renamed from: of */
    public static JSONStreamReader m6427of(InputStream inputStream) {
        return m6430of(inputStream, StandardCharsets.UTF_8, new Type[0]);
    }

    /* JADX INFO: renamed from: of */
    public static JSONStreamReader m6431of(InputStream inputStream, Type... typeArr) {
        return m6430of(inputStream, StandardCharsets.UTF_8, typeArr);
    }

    /* JADX INFO: renamed from: of */
    public static JSONStreamReader m6430of(InputStream inputStream, Charset charset, Type... typeArr) {
        if (charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            return new JSONStreamReaderUTF8(inputStream, charset, typeArr);
        }
        return new JSONStreamReaderUTF16(new InputStreamReader(inputStream, charset), typeArr);
    }

    /* JADX INFO: renamed from: of */
    public static JSONStreamReader m6428of(InputStream inputStream, Class cls) {
        return m6429of(inputStream, StandardCharsets.UTF_8, cls);
    }

    /* JADX INFO: renamed from: of */
    public static JSONStreamReader m6426of(File file) {
        return m6430of(Files.newInputStream(file.toPath(), new OpenOption[0]), StandardCharsets.UTF_8, new Type[0]);
    }
}
