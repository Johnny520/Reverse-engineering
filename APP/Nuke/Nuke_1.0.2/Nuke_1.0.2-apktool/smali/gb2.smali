.class public abstract Lgb2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lfb2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwy1;

    .line 2
    .line 3
    const/high16 v1, 0x42480000    # 50.0f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwy1;-><init>(F)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lfb2;

    .line 9
    .line 10
    invoke-direct {v1, v0, v0, v0, v0}, Lfb2;-><init>(Lx10;Lx10;Lx10;Lx10;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lgb2;->a:Lfb2;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(F)Lfb2;
    .locals 1

    .line 1
    new-instance v0, Lab0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lab0;-><init>(F)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lfb2;

    .line 7
    .line 8
    invoke-direct {p0, v0, v0, v0, v0}, Lfb2;-><init>(Lx10;Lx10;Lx10;Lx10;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
