.class public final Lbk1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Llq2;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lhn;->i:Lhn;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    invoke-static {v2, v1, v0}, Lp7;->e(IILhn;)Llq2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lbk1;->a:Llq2;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lj11;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lbk1;->a:Llq2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Llq2;->m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lk20;->h:Lk20;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 13
    .line 14
    return-object p0
.end method

.method public final b(Lj11;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbk1;->a:Llq2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llq2;->p(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
