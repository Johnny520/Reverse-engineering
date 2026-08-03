package p001;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: ۟.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0136a1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static int m801(Cursor cursor, String str) {
        String string;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String str2 = "." + str;
                    String str3 = "." + str + "`";
                    for (int i = 0; i < columnNames.length; i++) {
                        String str4 = columnNames[i];
                        if (str4.length() >= str.length() + 2 && (str4.endsWith(str2) || (str4.charAt(0) == '`' && str4.endsWith(str3)))) {
                            columnIndex = i;
                            break;
                        }
                    }
                    columnIndex = -1;
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            string = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            string = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }
}
