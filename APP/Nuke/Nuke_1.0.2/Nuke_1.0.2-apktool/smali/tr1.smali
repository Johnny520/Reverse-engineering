.class public final synthetic Ltr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:J

.field public final synthetic j:Z


# direct methods
.method public synthetic constructor <init>(ZJZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ltr1;->h:Z

    .line 5
    .line 6
    iput-wide p2, p0, Ltr1;->i:J

    .line 7
    .line 8
    iput-boolean p4, p0, Ltr1;->j:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 p1, 0xc01

    .line 10
    .line 11
    invoke-static {p1}, Lpp0;->N(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-boolean v0, p0, Ltr1;->h:Z

    .line 16
    .line 17
    iget-wide v1, p0, Ltr1;->i:J

    .line 18
    .line 19
    iget-boolean v3, p0, Ltr1;->j:Z

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lur1;->b(ZJZLpx;I)V

    .line 22
    .line 23
    .line 24
    sget-object p0, La83;->a:La83;

    .line 25
    .line 26
    return-object p0
.end method
