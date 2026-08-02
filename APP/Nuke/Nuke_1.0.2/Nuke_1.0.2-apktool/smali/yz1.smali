.class public abstract Lyz1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lo9;

.field public static final b:Li51;

.field public static final c:Leb;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "java.vm.name"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v1, "RoboVM"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x5

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const-string v1, "Dalvik"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    sput-object v3, Lyz1;->a:Lo9;

    .line 29
    .line 30
    new-instance v0, Lc72;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, v1}, Lc72;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lyz1;->b:Li51;

    .line 37
    .line 38
    new-instance v0, Lun;

    .line 39
    .line 40
    invoke-direct {v0, v2}, Leb;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lyz1;->c:Leb;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance v0, Lo9;

    .line 47
    .line 48
    invoke-direct {v0}, Lo9;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lyz1;->a:Lo9;

    .line 52
    .line 53
    new-instance v0, Lc72;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, v1}, Lc72;-><init>(I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lyz1;->b:Li51;

    .line 60
    .line 61
    new-instance v0, Lun;

    .line 62
    .line 63
    invoke-direct {v0, v2}, Leb;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lyz1;->c:Leb;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    sput-object v3, Lyz1;->a:Lo9;

    .line 70
    .line 71
    new-instance v0, Li51;

    .line 72
    .line 73
    const/16 v1, 0x11

    .line 74
    .line 75
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 76
    .line 77
    .line 78
    sput-object v0, Lyz1;->b:Li51;

    .line 79
    .line 80
    new-instance v0, Leb;

    .line 81
    .line 82
    invoke-direct {v0, v2}, Leb;-><init>(I)V

    .line 83
    .line 84
    .line 85
    sput-object v0, Lyz1;->c:Leb;

    .line 86
    .line 87
    return-void
.end method
