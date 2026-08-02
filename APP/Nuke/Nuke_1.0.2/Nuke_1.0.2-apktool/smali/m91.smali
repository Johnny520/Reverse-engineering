.class public final Lm91;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgy;
.implements Ldq0;


# instance fields
.field public v:Ll9;

.field public w:Lt91;

.field public x:Lb03;

.field public final y:Lnx1;


# direct methods
.method public constructor <init>(Ll9;Lt91;Lb03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm91;->v:Ll9;

    .line 5
    .line 6
    iput-object p2, p0, Lm91;->w:Lt91;

    .line 7
    .line 8
    iput-object p3, p0, Lm91;->x:Lb03;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lm91;->y:Lnx1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final E0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm91;->v:Ll9;

    .line 2
    .line 3
    iget-object v1, v0, Ll9;->a:Lm91;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v1, "Expected textInputModifierNode to be null"

    .line 9
    .line 10
    invoke-static {v1}, Lnz0;->c(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iput-object p0, v0, Ll9;->a:Lm91;

    .line 14
    .line 15
    return-void
.end method

.method public final F0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm91;->v:Ll9;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ll9;->k(Lm91;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w(Lzn1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm91;->y:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
