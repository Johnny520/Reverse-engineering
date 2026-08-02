.class public final Lm82;
.super Lo82;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic b:Lvf1;

.field public final synthetic c:Lno;


# direct methods
.method public constructor <init>(Lvf1;Lno;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm82;->b:Lvf1;

    .line 5
    .line 6
    iput-object p2, p0, Lm82;->c:Lno;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object p0, p0, Lm82;->c:Lno;

    .line 2
    .line 3
    invoke-virtual {p0}, Lno;->a()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-long v0, p0

    .line 8
    return-wide v0
.end method

.method public final b()Lvf1;
    .locals 0

    .line 1
    iget-object p0, p0, Lm82;->b:Lvf1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Lnn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm82;->c:Lno;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lnn;->z(Lno;)Lnn;

    .line 4
    .line 5
    .line 6
    return-void
.end method
