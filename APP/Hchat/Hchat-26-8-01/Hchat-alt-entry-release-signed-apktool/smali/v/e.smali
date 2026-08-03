.class public abstract Lv/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lv/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv/c;

    .line 2
    .line 3
    const/16 v1, 0x32

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-direct {v0, v1}, Lv/c;-><init>(F)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lv/d;

    .line 10
    .line 11
    invoke-direct {v1, v0, v0, v0, v0}, Lv/d;-><init>(Lv/a;Lv/a;Lv/a;Lv/a;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lv/e;->a:Lv/d;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(F)Lv/d;
    .locals 1

    .line 1
    new-instance v0, Lv/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lv/b;-><init>(F)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lv/d;

    .line 7
    .line 8
    invoke-direct {p0, v0, v0, v0, v0}, Lv/d;-><init>(Lv/a;Lv/a;Lv/a;Lv/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
