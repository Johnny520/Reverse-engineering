.class public final synthetic La8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lws1;

.field public final synthetic i:Luh1;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lws1;Luh1;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La8;->h:Lws1;

    .line 5
    .line 6
    iput-object p2, p0, La8;->i:Luh1;

    .line 7
    .line 8
    iput-wide p3, p0, La8;->j:J

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
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lpp0;->N(I)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    iget-object v0, p0, La8;->h:Lws1;

    .line 15
    .line 16
    iget-object v1, p0, La8;->i:Luh1;

    .line 17
    .line 18
    iget-wide v2, p0, La8;->j:J

    .line 19
    .line 20
    invoke-static/range {v0 .. v5}, Le8;->a(Lws1;Luh1;JLpx;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, La83;->a:La83;

    .line 24
    .line 25
    return-object p0
.end method
