.class public final Lzk2;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    and-int/lit8 p1, p1, 0x4

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x1

    .line 8
    :goto_0
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lzk2;->h:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lzk2;->i:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p1, p0, Lzk2;->j:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lzk2;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
