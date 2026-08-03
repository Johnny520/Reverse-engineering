.class public abstract Lb3/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:La/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, La/a;->o(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lb3/f;

    .line 13
    .line 14
    invoke-direct {v0}, La/a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lb3/c;->a:La/a;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v1, 0x1c

    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Lb3/e;

    .line 25
    .line 26
    invoke-direct {v0}, Lb3/d;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lb3/c;->a:La/a;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-instance v0, Lb3/d;

    .line 33
    .line 34
    invoke-direct {v0}, Lb3/d;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lb3/c;->a:La/a;

    .line 38
    .line 39
    :goto_0
    new-instance v0, Landroidx/lifecycle/e0;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {v0, v1}, Landroidx/lifecycle/e0;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 46
    .line 47
    .line 48
    return-void
.end method
