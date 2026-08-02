.class public abstract Lfq2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lfb2;

.field public static final b:Lfb2;

.field public static final c:Lfb2;

.field public static final d:Lfb2;

.field public static final e:Lfb2;

.field public static final f:Lfb2;

.field public static final g:Lfb2;

.field public static final h:Lfb2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lgq2;->d:Lfb2;

    .line 2
    .line 3
    sput-object v0, Lfq2;->a:Lfb2;

    .line 4
    .line 5
    sget-object v0, Lgq2;->h:Lfb2;

    .line 6
    .line 7
    sput-object v0, Lfq2;->b:Lfb2;

    .line 8
    .line 9
    sget-object v0, Lgq2;->g:Lfb2;

    .line 10
    .line 11
    sput-object v0, Lfq2;->c:Lfb2;

    .line 12
    .line 13
    sget-object v0, Lgq2;->e:Lfb2;

    .line 14
    .line 15
    sput-object v0, Lfq2;->d:Lfb2;

    .line 16
    .line 17
    sget-object v0, Lgq2;->f:Lfb2;

    .line 18
    .line 19
    sput-object v0, Lfq2;->e:Lfb2;

    .line 20
    .line 21
    sget-object v0, Lgq2;->b:Lfb2;

    .line 22
    .line 23
    sput-object v0, Lfq2;->f:Lfb2;

    .line 24
    .line 25
    sget-object v0, Lgq2;->c:Lfb2;

    .line 26
    .line 27
    sput-object v0, Lfq2;->g:Lfb2;

    .line 28
    .line 29
    sget-object v0, Lgq2;->a:Lfb2;

    .line 30
    .line 31
    sput-object v0, Lfq2;->h:Lfb2;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/high16 v1, 0x42c80000    # 100.0f

    .line 35
    .line 36
    cmpg-float v0, v1, v0

    .line 37
    .line 38
    if-ltz v0, :cond_0

    .line 39
    .line 40
    cmpl-float v0, v1, v1

    .line 41
    .line 42
    if-lez v0, :cond_1

    .line 43
    .line 44
    :cond_0
    const-string v0, "The percent should be in the range of [0, 100]"

    .line 45
    .line 46
    invoke-static {v0}, Lnz0;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method
