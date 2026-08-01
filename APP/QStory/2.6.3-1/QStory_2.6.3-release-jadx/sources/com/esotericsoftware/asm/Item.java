package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes.dex */
final class Item {

    /* JADX INFO: renamed from: a */
    int f209a;

    /* JADX INFO: renamed from: b */
    int f210b;

    /* JADX INFO: renamed from: c */
    int f211c;

    /* JADX INFO: renamed from: d */
    long f212d;

    /* JADX INFO: renamed from: g */
    String f213g;

    /* JADX INFO: renamed from: h */
    String f214h;

    /* JADX INFO: renamed from: i */
    String f215i;

    /* JADX INFO: renamed from: j */
    int f216j;

    /* JADX INFO: renamed from: k */
    Item f217k;

    public Item(int i, Item item) {
        this.f209a = i;
        this.f210b = item.f210b;
        this.f211c = item.f211c;
        this.f212d = item.f212d;
        this.f213g = item.f213g;
        this.f214h = item.f214h;
        this.f215i = item.f215i;
        this.f216j = item.f216j;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m106a(Item item) {
        int i = this.f210b;
        if (i != 1) {
            if (i == 12) {
                return item.f213g.equals(this.f213g) && item.f214h.equals(this.f214h);
            }
            if (i != 16) {
                if (i == 18) {
                    return item.f212d == this.f212d && item.f213g.equals(this.f213g) && item.f214h.equals(this.f214h);
                }
                switch (i) {
                    case 3:
                    case 4:
                        return item.f211c == this.f211c;
                    case 5:
                    case 6:
                        return item.f212d == this.f212d;
                    case 7:
                    case 8:
                        break;
                    default:
                        switch (i) {
                            case 30:
                                break;
                            case 31:
                                return item.f211c == this.f211c && item.f213g.equals(this.f213g);
                            case 32:
                                break;
                            default:
                                return item.f213g.equals(this.f213g) && item.f214h.equals(this.f214h) && item.f215i.equals(this.f215i);
                        }
                        break;
                }
            }
        }
        return item.f213g.equals(this.f213g);
    }

    public Item(int i) {
        this.f209a = i;
    }

    public Item() {
    }

    /* JADX INFO: renamed from: a */
    public void m100a(float f) {
        this.f210b = 4;
        this.f211c = Float.floatToRawIntBits(f);
        this.f216j = Integer.MAX_VALUE & (this.f210b + ((int) f));
    }

    /* JADX INFO: renamed from: a */
    public void m101a(int i) {
        this.f210b = 3;
        this.f211c = i;
        this.f216j = (3 + i) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public void m102a(int i, int i2) {
        this.f210b = 33;
        this.f211c = i;
        this.f216j = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m103a(int i, String str, String str2, String str3) {
        int iHashCode;
        int iHashCode2;
        this.f210b = i;
        this.f213g = str;
        this.f214h = str2;
        this.f215i = str3;
        if (i == 1) {
            iHashCode = str.hashCode();
            iHashCode2 = (iHashCode + i) & Integer.MAX_VALUE;
        } else if (i == 12) {
            iHashCode2 = ((str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        } else if (i != 16 && i != 30) {
            if (i != 7) {
                if (i != 8) {
                    iHashCode = str3.hashCode() * str2.hashCode() * str.hashCode();
                }
                iHashCode2 = (iHashCode + i) & Integer.MAX_VALUE;
            } else {
                this.f211c = 0;
            }
            iHashCode = str.hashCode();
            iHashCode2 = (iHashCode + i) & Integer.MAX_VALUE;
        }
        this.f216j = iHashCode2;
    }

    /* JADX INFO: renamed from: a */
    public void m104a(long j) {
        this.f210b = 5;
        this.f212d = j;
        this.f216j = Integer.MAX_VALUE & (5 + ((int) j));
    }

    /* JADX INFO: renamed from: a */
    public void m105a(String str, String str2, int i) {
        this.f210b = 18;
        this.f212d = i;
        this.f213g = str;
        this.f214h = str2;
        this.f216j = Integer.MAX_VALUE & ((this.f214h.hashCode() * str.hashCode() * i) + 18);
    }

    /* JADX INFO: renamed from: a */
    public void m99a(double d) {
        this.f210b = 6;
        this.f212d = Double.doubleToRawLongBits(d);
        this.f216j = Integer.MAX_VALUE & (this.f210b + ((int) d));
    }
}
