.class public final Ln82;
.super Lo82;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic b:Lvf1;

.field public final synthetic c:I

.field public final synthetic d:[B


# direct methods
.method public constructor <init>(Lvf1;I[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln82;->b:Lvf1;

    .line 5
    .line 6
    iput p2, p0, Ln82;->c:I

    .line 7
    .line 8
    iput-object p3, p0, Ln82;->d:[B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget p0, p0, Ln82;->c:I

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final b()Lvf1;
    .locals 0

    .line 1
    iget-object p0, p0, Ln82;->b:Lvf1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Lnn;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln82;->d:[B

    .line 2
    .line 3
    iget p0, p0, Ln82;->c:I

    .line 4
    .line 5
    invoke-interface {p1, p0, v0}, Lnn;->w(I[B)Lnn;

    .line 6
    .line 7
    .line 8
    return-void
.end method
