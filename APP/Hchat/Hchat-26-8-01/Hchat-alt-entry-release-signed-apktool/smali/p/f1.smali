.class public final Lp/f1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp/f1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp/f1;->a:Lp/f1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ly0/o;Z)Ly0/o;
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    float-to-double v1, v0

    .line 4
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmpl-double v1, v1, v3

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "invalid weight; must be greater than zero"

    .line 12
    .line 13
    invoke-static {v1}, Lq/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    new-instance v1, Lp/q0;

    .line 17
    .line 18
    invoke-direct {v1, v0, p2}, Lp/q0;-><init>(FZ)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
