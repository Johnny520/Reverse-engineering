.class public final synthetic Lu13;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lju;

.field public final synthetic i:Luh1;

.field public final synthetic j:Z

.field public final synthetic k:F

.field public final synthetic l:Lxm0;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lju;Luh1;ZFLxm0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu13;->h:Lju;

    .line 5
    .line 6
    iput-object p2, p0, Lu13;->i:Luh1;

    .line 7
    .line 8
    iput-boolean p3, p0, Lu13;->j:Z

    .line 9
    .line 10
    iput p4, p0, Lu13;->k:F

    .line 11
    .line 12
    iput-object p5, p0, Lu13;->l:Lxm0;

    .line 13
    .line 14
    iput p7, p0, Lu13;->m:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Lpx;

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
    move-result v6

    .line 15
    iget-object v0, p0, Lu13;->h:Lju;

    .line 16
    .line 17
    iget-object v1, p0, Lu13;->i:Luh1;

    .line 18
    .line 19
    iget-boolean v2, p0, Lu13;->j:Z

    .line 20
    .line 21
    iget v3, p0, Lu13;->k:F

    .line 22
    .line 23
    iget-object v4, p0, Lu13;->l:Lxm0;

    .line 24
    .line 25
    iget v7, p0, Lu13;->m:I

    .line 26
    .line 27
    invoke-static/range {v0 .. v7}, Lgf1;->h(Lju;Luh1;ZFLxm0;Lpx;II)V

    .line 28
    .line 29
    .line 30
    sget-object p0, La83;->a:La83;

    .line 31
    .line 32
    return-object p0
.end method
