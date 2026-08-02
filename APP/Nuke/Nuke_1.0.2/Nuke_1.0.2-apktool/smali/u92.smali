.class public abstract Lu92;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final i:Lt92;


# instance fields
.field public h:Ls92;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lno;->k:Lno;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lfn;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lfn;->B(Lno;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lno;->h:[B

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    int-to-long v2, v0

    .line 18
    new-instance v0, Lt92;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v0, v4, v2, v3, v1}, Lt92;-><init>(Lvf1;JLfn;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lu92;->i:Lt92;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b()Ljava/io/InputStream;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu92;->g()Lon;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lon;->C()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public abstract c()J
.end method

.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu92;->g()Lon;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lug3;->b(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract e()Lvf1;
.end method

.method public abstract g()Lon;
.end method
