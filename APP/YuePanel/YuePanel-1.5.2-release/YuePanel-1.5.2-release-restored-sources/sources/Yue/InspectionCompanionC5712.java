package Yue;

import Yue.C6411;
import Yue.C6898;
import Yue.InterfaceC7144;
import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.widget.C8754;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC5712 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f1625 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1626;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f14088;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f14089;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f14090;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f14091;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f14092;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f14093;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f14094;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f14095;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۢ$ۥ */
    public class C0842 implements IntFunction<String> {
        public C0842() {
        }

        /* JADX DEBUG: Method merged with bridge method: apply(I)Ljava/lang/Object; */
        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public String apply(int i) {
            return i != 0 ? i != 1 ? String.valueOf(i) : "vertical" : "horizontal";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۢ$ۥ۟ */
    public class C0843 implements IntFunction<Set<String>> {
        public C0843() {
        }

        /* JADX DEBUG: Method merged with bridge method: apply(I)Ljava/lang/Object; */
        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Set<String> apply(int i) {
            HashSet hashSet = new HashSet();
            if (i == 0) {
                hashSet.add("none");
            }
            if (i == 1) {
                hashSet.add("beginning");
            }
            if (i == 2) {
                hashSet.add("middle");
            }
            if (i == 4) {
                hashSet.add("end");
            }
            return hashSet;
        }
    }

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f1626 = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
        this.f14088 = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
        this.f14089 = propertyMapper.mapGravity(C6411.C6456.f16507, R.attr.gravity);
        this.f14090 = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new C0842());
        this.f14091 = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
        this.f14092 = propertyMapper.mapObject("divider", C6898.C1110.f18455);
        this.f14093 = propertyMapper.mapInt("dividerPadding", C6898.C1110.f18457);
        this.f14094 = propertyMapper.mapBoolean("measureWithLargestChild", C6898.C1110.f18516);
        this.f14095 = propertyMapper.mapIntFlag("showDividers", C6898.C1110.f18550, new C0843());
        this.f1625 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C8754 c8754, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f1625) {
            throw C3275.m346();
        }
        propertyReader.readBoolean(this.f1626, c8754.isBaselineAligned());
        propertyReader.readInt(this.f14088, c8754.getBaselineAlignedChildIndex());
        propertyReader.readGravity(this.f14089, c8754.getGravity());
        propertyReader.readIntEnum(this.f14090, c8754.getOrientation());
        propertyReader.readFloat(this.f14091, c8754.getWeightSum());
        propertyReader.readObject(this.f14092, c8754.getDividerDrawable());
        propertyReader.readInt(this.f14093, c8754.getDividerPadding());
        propertyReader.readBoolean(this.f14094, c8754.isMeasureWithLargestChildEnabled());
        propertyReader.readIntFlag(this.f14095, c8754.getShowDividers());
    }
}
