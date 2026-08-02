.class public final synthetic Llr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lbs0;

.field public final synthetic j:I

.field public final synthetic k:Lin0;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(ZLbs0;ILin0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Llr1;->h:Z

    .line 5
    .line 6
    iput-object p2, p0, Llr1;->i:Lbs0;

    .line 7
    .line 8
    iput p3, p0, Llr1;->j:I

    .line 9
    .line 10
    iput-object p4, p0, Llr1;->k:Lin0;

    .line 11
    .line 12
    iput-boolean p5, p0, Llr1;->l:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Llr1;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Llr1;->i:Lbs0;

    .line 6
    .line 7
    check-cast v0, Lb02;

    .line 8
    .line 9
    iget v1, p0, Llr1;->j:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lb02;->a(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-boolean v0, p0, Llr1;->l:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p0, p0, Llr1;->k:Lin0;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, La83;->a:La83;

    .line 28
    .line 29
    return-object p0
.end method
