.class public final Lbh2;
.super Ljava/io/IOException;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final h:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const-string v0, "Script file exceeds "

    .line 2
    .line 3
    const-string v1, " bytes."

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lhk1;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput p1, p0, Lbh2;->h:I

    .line 13
    .line 14
    return-void
.end method
