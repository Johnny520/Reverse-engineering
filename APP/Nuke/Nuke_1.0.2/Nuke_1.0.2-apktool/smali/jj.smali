.class public final synthetic Ljj;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lxm0;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(ZLxm0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ljj;->h:Z

    .line 5
    .line 6
    iput-object p2, p0, Ljj;->i:Lxm0;

    .line 7
    .line 8
    iput p4, p0, Ljj;->j:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-static {p2}, Lpp0;->N(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-boolean v0, p0, Ljj;->h:Z

    .line 14
    .line 15
    iget-object v1, p0, Ljj;->i:Lxm0;

    .line 16
    .line 17
    iget p0, p0, Ljj;->j:I

    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2, p0}, Lpp0;->c(ZLxm0;Lpx;II)V

    .line 20
    .line 21
    .line 22
    sget-object p0, La83;->a:La83;

    .line 23
    .line 24
    return-object p0
.end method
