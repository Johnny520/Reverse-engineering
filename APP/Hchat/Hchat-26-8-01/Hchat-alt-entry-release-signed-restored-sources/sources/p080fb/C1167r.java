package p080fb;

import java.io.File;
import java.util.Comparator;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p007a7.AbstractC0018a;

/* JADX INFO: renamed from: fb.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1167r implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3896g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b.e.<init>(java.util.ArrayList, fb.b):void, b.e.v():java.lang.String, fb.g1.i(android.content.Context):java.util.List, fb.t2.M(java.io.File):void, fb.t2.U(java.io.File, java.io.File):void, fb.t2.d(java.io.File, java.io.File, fb.i2):void, fb.t2.k(java.util.ArrayList, gg.q, java.io.File, java.util.ArrayList, boolean, java.io.File):void, fb.u.r(java.lang.Object, java.lang.String):java.lang.Object, fb.u.v(android.content.Context, fb.v, fb.b1, fb.b, c9.k, boolean, boolean, boolean, fb.s):fb.t1, wb.y2.u0(android.content.Context, wb.k6, ia.n, i0.h0, int):void] */
    public /* synthetic */ C1167r(int i9) {
        this.f3896g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3896g) {
            case 0:
                return String.valueOf(obj).compareTo(String.valueOf(obj2));
            case 1:
                return ((C1127h) obj).f3688a.compareTo(((C1127h) obj2).f3688a);
            case 2:
                return Boolean.valueOf(!((File) obj).isDirectory()).compareTo(Boolean.valueOf(!((File) obj2).isDirectory()));
            case 3:
                return Long.valueOf(((C1148m0) obj).f3788f).compareTo(Long.valueOf(((C1148m0) obj2).f3788f));
            case 4:
                return Long.valueOf(((C1148m0) obj).f3788f).compareTo(Long.valueOf(((C1148m0) obj2).f3788f));
            case 5:
                return AbstractC0018a.m249m(((JSONObject) obj).optString("name", HttpUrl.FRAGMENT_ENCODE_SET), ((JSONObject) obj2).optString("name", HttpUrl.FRAGMENT_ENCODE_SET));
            case 6:
                return ((C1160p0) obj).f3851b.compareTo(((C1160p0) obj2).f3851b);
            case 7:
                return Boolean.valueOf(((C1113d1) obj2).f3647l).compareTo(Boolean.valueOf(((C1113d1) obj).f3647l));
            case 8:
                return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
            case 9:
                String str = (String) obj;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (i9 >= str.length()) {
                        Integer numValueOf = Integer.valueOf(i10);
                        String str2 = (String) obj2;
                        int i11 = 0;
                        for (int i12 = 0; i12 < str2.length(); i12++) {
                            if (Boolean.valueOf(Character.valueOf(str2.charAt(i12)).charValue() == '/').booleanValue()) {
                                i11++;
                            }
                        }
                        return numValueOf.compareTo(Integer.valueOf(i11));
                    }
                    if (Boolean.valueOf(Character.valueOf(str.charAt(i9)).charValue() == '/').booleanValue()) {
                        i10++;
                    }
                    i9++;
                }
                break;
            case 10:
                String str3 = (String) obj2;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 >= str3.length()) {
                        Integer numValueOf2 = Integer.valueOf(i14);
                        String str4 = (String) obj;
                        int i15 = 0;
                        for (int i16 = 0; i16 < str4.length(); i16++) {
                            if (Boolean.valueOf(Character.valueOf(str4.charAt(i16)).charValue() == '/').booleanValue()) {
                                i15++;
                            }
                        }
                        return numValueOf2.compareTo(Integer.valueOf(i15));
                    }
                    if (Boolean.valueOf(Character.valueOf(str3.charAt(i13)).charValue() == '/').booleanValue()) {
                        i14++;
                    }
                    i13++;
                }
                break;
            case 11:
                return AbstractC0018a.m249m(((File) obj).getName(), ((File) obj2).getName());
            case 12:
                return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
            case 13:
                return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
            case 14:
                CharSequence charSequence = (CharSequence) ((Map.Entry) obj).getKey();
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (i17 >= charSequence.length()) {
                        Integer numValueOf3 = Integer.valueOf(i18);
                        CharSequence charSequence2 = (CharSequence) ((Map.Entry) obj2).getKey();
                        int i19 = 0;
                        for (int i20 = 0; i20 < charSequence2.length(); i20++) {
                            if (Boolean.valueOf(Character.valueOf(charSequence2.charAt(i20)).charValue() == '/').booleanValue()) {
                                i19++;
                            }
                        }
                        return numValueOf3.compareTo(Integer.valueOf(i19));
                    }
                    if (Boolean.valueOf(Character.valueOf(charSequence.charAt(i17)).charValue() == '/').booleanValue()) {
                        i18++;
                    }
                    i17++;
                }
                break;
            default:
                String str5 = (String) obj2;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i21 >= str5.length()) {
                        Integer numValueOf4 = Integer.valueOf(i22);
                        String str6 = (String) obj;
                        int i23 = 0;
                        for (int i24 = 0; i24 < str6.length(); i24++) {
                            if (Boolean.valueOf(Character.valueOf(str6.charAt(i24)).charValue() == '/').booleanValue()) {
                                i23++;
                            }
                        }
                        return numValueOf4.compareTo(Integer.valueOf(i23));
                    }
                    if (Boolean.valueOf(Character.valueOf(str5.charAt(i21)).charValue() == '/').booleanValue()) {
                        i22++;
                    }
                    i21++;
                }
                break;
        }
    }
}
