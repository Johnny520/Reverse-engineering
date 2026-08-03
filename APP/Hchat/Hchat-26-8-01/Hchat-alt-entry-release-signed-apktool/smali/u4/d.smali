.class public abstract Lu4/d;
.super Lu4/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lv4/a;


# direct methods
.method public constructor <init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lu4/i;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 2
    .line 3
    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    iput-object p5, p0, Lu4/d;->k:Lv4/a;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p1, "cst == null"

    .line 10
    .line 11
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1
.end method


# virtual methods
.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/d;->k:Lv4/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lz4/k;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
