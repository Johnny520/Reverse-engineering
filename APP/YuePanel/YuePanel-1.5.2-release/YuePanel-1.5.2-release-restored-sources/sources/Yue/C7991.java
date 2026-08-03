package Yue;

import Yue.AbstractC7956;
import Yue.InterfaceC7144;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7991 extends AbstractC7956 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f23757 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f23758 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f23759 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f23760 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f23761 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f23762 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public ArrayList<AbstractC7956> f23763;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f23764;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f23765;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f23766;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f23767;

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۡ$ۥ */
    public class C1396 extends C7985 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ AbstractC7956 f3166;

        public C1396(AbstractC7956 abstractC7956) {
            this.f3166 = abstractC7956;
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f3166.runAnimators();
            abstractC7956.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۡ$ۥ۟ */
    public class C1397 extends C7985 {
        public C1397() {
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
            C7991.this.f23763.remove(abstractC7956);
            if (C7991.this.hasAnimators()) {
                return;
            }
            C7991.this.notifyListeners(AbstractC7956.InterfaceC7965.f23739, false);
            C7991 c7991 = C7991.this;
            c7991.mEnded = true;
            c7991.notifyListeners(AbstractC7956.InterfaceC7965.f3150, false);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۡ$ۥ۟۟, reason: contains not printable characters */
    public static class C7992 extends C7985 {

        /* JADX INFO: renamed from: ۥ */
        public C7991 f3169;

        public C7992(C7991 c7991) {
            this.f3169 = c7991;
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            C7991 c7991 = this.f3169;
            int i = c7991.f23765 - 1;
            c7991.f23765 = i;
            if (i == 0) {
                c7991.f23766 = false;
                c7991.end();
            }
            abstractC7956.removeListener(this);
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
            C7991 c7991 = this.f3169;
            if (c7991.f23766) {
                return;
            }
            c7991.start();
            this.f3169.f23766 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7991() {
        this.f23763 = new ArrayList<>();
        this.f23764 = true;
        this.f23766 = false;
        this.f23767 = 0;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).cancel();
        }
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        if (isValidTarget(c7995.f3178)) {
            for (AbstractC7956 abstractC7956 : this.f23763) {
                if (abstractC7956.isValidTarget(c7995.f3178)) {
                    abstractC7956.captureEndValues(c7995);
                    c7995.f23769.add(abstractC7956);
                }
            }
        }
    }

    @Override // Yue.AbstractC7956
    public void capturePropagationValues(C7995 c7995) {
        super.capturePropagationValues(c7995);
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).capturePropagationValues(c7995);
        }
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        if (isValidTarget(c7995.f3178)) {
            for (AbstractC7956 abstractC7956 : this.f23763) {
                if (abstractC7956.isValidTarget(c7995.f3178)) {
                    abstractC7956.captureStartValues(c7995);
                    c7995.f23769.add(abstractC7956);
                }
            }
        }
    }

    @Override // Yue.AbstractC7956
    public void createAnimators(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 C7996 c7996, @InterfaceC6391 C7996 c79962, @InterfaceC6391 ArrayList<C7995> arrayList, @InterfaceC6391 ArrayList<C7995> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            AbstractC7956 abstractC7956 = this.f23763.get(i);
            if (startDelay > 0 && (this.f23764 || i == 0)) {
                long startDelay2 = abstractC7956.getStartDelay();
                if (startDelay2 > 0) {
                    abstractC7956.setStartDelay(startDelay2 + startDelay);
                } else {
                    abstractC7956.setStartDelay(startDelay);
                }
            }
            abstractC7956.createAnimators(viewGroup, c7996, c79962, arrayList, arrayList2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public AbstractC7956 excludeTarget(@InterfaceC6391 View view, boolean z) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).forceToEnd(viewGroup);
        }
    }

    @Override // Yue.AbstractC7956
    public boolean hasAnimators() {
        for (int i = 0; i < this.f23763.size(); i++) {
            if (this.f23763.get(i).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            if (!this.f23763.get(i).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void pause(@InterfaceC6490 View view) {
        super.pause(view);
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).pause(view);
        }
    }

    @Override // Yue.AbstractC7956
    @InterfaceC7113(34)
    public void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        C1397 c1397 = new C1397();
        for (int i = 0; i < this.f23763.size(); i++) {
            AbstractC7956 abstractC7956 = this.f23763.get(i);
            abstractC7956.addListener(c1397);
            abstractC7956.prepareAnimatorsForSeeking();
            long totalDurationMillis = abstractC7956.getTotalDurationMillis();
            if (this.f23764) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                abstractC7956.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
        }
    }

    @Override // Yue.AbstractC7956
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void resume(@InterfaceC6490 View view) {
        super.resume(view);
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).resume(view);
        }
    }

    @Override // Yue.AbstractC7956
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.f23763.isEmpty()) {
            start();
            end();
            return;
        }
        m25197();
        if (this.f23764) {
            Iterator<AbstractC7956> it = this.f23763.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        for (int i = 1; i < this.f23763.size(); i++) {
            this.f23763.get(i - 1).addListener(new C1396(this.f23763.get(i)));
        }
        AbstractC7956 abstractC7956 = this.f23763.get(0);
        if (abstractC7956 != null) {
            abstractC7956.runAnimators();
        }
    }

    @Override // Yue.AbstractC7956
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).setCanRemoveViews(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // Yue.AbstractC7956
    @InterfaceC7113(34)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentPlayTimeMillis(long j, long j2) {
        boolean z;
        long totalDurationMillis = getTotalDurationMillis();
        if (this.mParent != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > totalDurationMillis && j2 > totalDurationMillis) {
                return;
            }
        }
        boolean z2 = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= totalDurationMillis && j2 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(AbstractC7956.InterfaceC7965.f3149, z2);
        }
        if (!this.f23764) {
            int iM25186 = m25186(j2);
            if (j >= j2) {
                while (iM25186 < this.f23763.size()) {
                    AbstractC7956 abstractC7956 = this.f23763.get(iM25186);
                    long j3 = abstractC7956.mSeekOffsetInParent;
                    z = z2;
                    long j4 = j - j3;
                    if (j4 < 0) {
                        break;
                    }
                    abstractC7956.setCurrentPlayTimeMillis(j4, j2 - j3);
                    iM25186++;
                    z2 = z;
                }
            } else {
                z = z2;
                while (iM25186 >= 0) {
                    AbstractC7956 abstractC79562 = this.f23763.get(iM25186);
                    long j5 = abstractC79562.mSeekOffsetInParent;
                    long j6 = j - j5;
                    abstractC79562.setCurrentPlayTimeMillis(j6, j2 - j5);
                    if (j6 >= 0) {
                        break;
                    } else {
                        iM25186--;
                    }
                }
            }
            if (this.mParent == null) {
                if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || j2 < 0)) {
                    return;
                }
                if (j > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(AbstractC7956.InterfaceC7965.f3150, z);
                return;
            }
            return;
        }
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).setCurrentPlayTimeMillis(j, j2);
        }
        z = z2;
        if (this.mParent == null) {
        }
    }

    @Override // Yue.AbstractC7956
    public void setEpicenterCallback(@InterfaceC6490 AbstractC7956.AbstractC7960 abstractC7960) {
        super.setEpicenterCallback(abstractC7960);
        this.f23767 |= 8;
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).setEpicenterCallback(abstractC7960);
        }
    }

    @Override // Yue.AbstractC7956
    public void setPathMotion(@InterfaceC6490 AbstractC6623 abstractC6623) {
        super.setPathMotion(abstractC6623);
        this.f23767 |= 4;
        if (this.f23763 != null) {
            for (int i = 0; i < this.f23763.size(); i++) {
                this.f23763.get(i).setPathMotion(abstractC6623);
            }
        }
    }

    @Override // Yue.AbstractC7956
    public void setPropagation(@InterfaceC6490 AbstractC7988 abstractC7988) {
        super.setPropagation(abstractC7988);
        this.f23767 |= 2;
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            this.f23763.get(i).setPropagation(abstractC7988);
        }
    }

    @Override // Yue.AbstractC7956
    public String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f23763.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("\n");
            sb.append(this.f23763.get(i).toString(str + "  "));
            string = sb.toString();
        }
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 addListener(@InterfaceC6391 AbstractC7956.InterfaceC7964 interfaceC7964) {
        return (C7991) super.addListener(interfaceC7964);
    }

    /* JADX DEBUG: Method merged with bridge method: addTarget(I)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 addTarget(@InterfaceC5411 int i) {
        for (int i2 = 0; i2 < this.f23763.size(); i2++) {
            this.f23763.get(i2).addTarget(i);
        }
        return (C7991) super.addTarget(i);
    }

    /* JADX DEBUG: Method merged with bridge method: addTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 addTarget(@InterfaceC6391 View view) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).addTarget(view);
        }
        return (C7991) super.addTarget(view);
    }

    /* JADX DEBUG: Method merged with bridge method: addTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 addTarget(@InterfaceC6391 Class<?> cls) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).addTarget(cls);
        }
        return (C7991) super.addTarget(cls);
    }

    /* JADX DEBUG: Method merged with bridge method: addTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 addTarget(@InterfaceC6391 String str) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).addTarget(str);
        }
        return (C7991) super.addTarget(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C7991 m25181(@InterfaceC6391 AbstractC7956 abstractC7956) {
        m25182(abstractC7956);
        long j = this.mDuration;
        if (j >= 0) {
            abstractC7956.setDuration(j);
        }
        if ((this.f23767 & 1) != 0) {
            abstractC7956.setInterpolator(getInterpolator());
        }
        if ((this.f23767 & 2) != 0) {
            abstractC7956.setPropagation(getPropagation());
        }
        if ((this.f23767 & 4) != 0) {
            abstractC7956.setPathMotion(getPathMotion());
        }
        if ((this.f23767 & 8) != 0) {
            abstractC7956.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m25182(@InterfaceC6391 AbstractC7956 abstractC7956) {
        this.f23763.add(abstractC7956);
        abstractC7956.mParent = this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public int m25183() {
        return !this.f23764 ? 1 : 0;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public AbstractC7956 m25184(int i) {
        if (i < 0 || i >= this.f23763.size()) {
            return null;
        }
        return this.f23763.get(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int m25185() {
        return this.f23763.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final int m25186(long j) {
        for (int i = 1; i < this.f23763.size(); i++) {
            if (this.f23763.get(i).mSeekOffsetInParent > j) {
                return i - 1;
            }
        }
        return this.f23763.size() - 1;
    }

    /* JADX DEBUG: Method merged with bridge method: removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 removeListener(@InterfaceC6391 AbstractC7956.InterfaceC7964 interfaceC7964) {
        return (C7991) super.removeListener(interfaceC7964);
    }

    /* JADX DEBUG: Method merged with bridge method: removeTarget(I)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 removeTarget(@InterfaceC5411 int i) {
        for (int i2 = 0; i2 < this.f23763.size(); i2++) {
            this.f23763.get(i2).removeTarget(i);
        }
        return (C7991) super.removeTarget(i);
    }

    /* JADX DEBUG: Method merged with bridge method: removeTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 removeTarget(@InterfaceC6391 View view) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).removeTarget(view);
        }
        return (C7991) super.removeTarget(view);
    }

    /* JADX DEBUG: Method merged with bridge method: removeTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 removeTarget(@InterfaceC6391 Class<?> cls) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).removeTarget(cls);
        }
        return (C7991) super.removeTarget(cls);
    }

    /* JADX DEBUG: Method merged with bridge method: removeTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 removeTarget(@InterfaceC6391 String str) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).removeTarget(str);
        }
        return (C7991) super.removeTarget(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C7991 m25192(@InterfaceC6391 AbstractC7956 abstractC7956) {
        this.f23763.remove(abstractC7956);
        abstractC7956.mParent = null;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setDuration(J)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 setDuration(long j) {
        ArrayList<AbstractC7956> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.f23763) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f23763.get(i).setDuration(j);
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setInterpolator(Landroid/animation/TimeInterpolator;)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 setInterpolator(@InterfaceC6490 TimeInterpolator timeInterpolator) {
        this.f23767 |= 1;
        ArrayList<AbstractC7956> arrayList = this.f23763;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f23763.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (C7991) super.setInterpolator(timeInterpolator);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public C7991 m25195(int i) {
        if (i == 0) {
            this.f23764 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.f23764 = false;
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setStartDelay(J)LYue/ۥۢۢ۟ۧ; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7991 setStartDelay(long j) {
        return (C7991) super.setStartDelay(j);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m25197() {
        C7992 c7992 = new C7992(this);
        Iterator<AbstractC7956> it = this.f23763.iterator();
        while (it.hasNext()) {
            it.next().addListener(c7992);
        }
        this.f23765 = this.f23763.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // Yue.AbstractC7956
    @InterfaceC6391
    /* JADX INFO: renamed from: clone */
    public AbstractC7956 mo25123clone() {
        C7991 c7991 = (C7991) super.mo25123clone();
        c7991.f23763 = new ArrayList<>();
        int size = this.f23763.size();
        for (int i = 0; i < size; i++) {
            c7991.m25182(this.f23763.get(i).mo25123clone());
        }
        return c7991;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public AbstractC7956 excludeTarget(@InterfaceC6391 String str, boolean z) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    public C7991(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23763 = new ArrayList<>();
        this.f23764 = true;
        this.f23766 = false;
        this.f23767 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23048);
        m25195(C8021.m25322(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public AbstractC7956 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f23763.size(); i2++) {
            this.f23763.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public AbstractC7956 excludeTarget(@InterfaceC6391 Class<?> cls, boolean z) {
        for (int i = 0; i < this.f23763.size(); i++) {
            this.f23763.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }
}
