.class public abstract Lc63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lo63;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lo63;

    .line 2
    .line 3
    sget-object v6, Lim0;->j:Lim0;

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-static {v1}, Lrg3;->D(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    const/16 v1, 0x18

    .line 12
    .line 13
    invoke-static {v1}, Lrg3;->D(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide v10

    .line 17
    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    .line 18
    .line 19
    invoke-static {v1, v2}, Lrg3;->C(D)J

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    new-instance v1, Lm13;

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const v14, 0xfdff59

    .line 27
    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v12, 0x0

    .line 33
    invoke-direct/range {v1 .. v14}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 34
    .line 35
    .line 36
    const/16 v2, 0x7dff

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lo63;-><init>(Lm13;I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lc63;->a:Lo63;

    .line 42
    .line 43
    return-void
.end method
