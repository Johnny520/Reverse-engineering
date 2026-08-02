.class public abstract Le30;
.super Li01;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final l:Ldz;


# direct methods
.method public constructor <init>(Lza2;Lkt2;Lr72;Ls72;Ldz;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Li01;-><init>(Lza2;Lkt2;Lr72;Ls72;)V

    .line 2
    .line 3
    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    iput-object p5, p0, Le30;->l:Ldz;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "cst == null"

    .line 10
    .line 11
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le30;->l:Ldz;

    .line 2
    .line 3
    invoke-interface {p0}, Lt23;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
