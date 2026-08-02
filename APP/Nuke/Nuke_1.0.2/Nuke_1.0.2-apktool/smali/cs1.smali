.class public final Lcs1;
.super Lq43;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final b:Lbs1;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcs1;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lcs1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lbs1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, Lbs1;-><init>(Lq43;I)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcs1;->b:Lbs1;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcs1;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ll41;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ll41;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lvi0;->u(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x5

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-ne v1, p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ll41;->E()V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_0
    invoke-static {v0}, Lvi0;->x(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p1, v0}, Ll41;->o(Z)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "Expecting number, got: "

    .line 34
    .line 35
    const-string v1, "; at path "

    .line 36
    .line 37
    invoke-static {v0, p0, v1, p1}, Lum2;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    iget p0, p0, Lcs1;->a:I

    .line 42
    .line 43
    invoke-static {p0, p1}, Lhk1;->a(ILl41;)Ljava/lang/Number;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final c(Lo41;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lo41;->B(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
