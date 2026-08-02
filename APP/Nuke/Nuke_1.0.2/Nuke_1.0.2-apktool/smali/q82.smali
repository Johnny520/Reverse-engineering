.class public final Lq82;
.super Lo82;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final b:Lo82;

.field public final c:Lvf1;


# direct methods
.method public constructor <init>(Lo82;Lvf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq82;->b:Lo82;

    .line 5
    .line 6
    iput-object p2, p0, Lq82;->c:Lvf1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object p0, p0, Lq82;->b:Lo82;

    .line 2
    .line 3
    invoke-virtual {p0}, Lo82;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final b()Lvf1;
    .locals 0

    .line 1
    iget-object p0, p0, Lq82;->c:Lvf1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Lnn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lq82;->b:Lo82;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo82;->d(Lnn;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
