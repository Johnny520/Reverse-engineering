.class public final synthetic Lig1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/util/List;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Llg1;

.field public final synthetic ι:Ljava/lang/String;

.field public final synthetic κ:Ljava/lang/String;

.field public final synthetic λ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;Landroid/app/Activity;Llg1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lig1;->ε:I

    .line 5
    .line 6
    iput-object p2, p0, Lig1;->ζ:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lig1;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lig1;->θ:Llg1;

    .line 11
    .line 12
    iput-object p5, p0, Lig1;->ι:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lig1;->κ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lig1;->λ:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    int-to-double v0, p1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ge p2, v2, :cond_0

    .line 16
    .line 17
    move v3, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, p2

    .line 20
    :goto_0
    int-to-double v3, v3

    .line 21
    div-double/2addr v0, v3

    .line 22
    iget-object v3, p0, Lig1;->ζ:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v3, v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v3

    .line 32
    :goto_1
    int-to-double v2, v2

    .line 33
    const-wide v4, 0x4052c00000000000L    # 75.0

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    div-double/2addr v4, v2

    .line 39
    mul-double/2addr v4, v0

    .line 40
    double-to-int v0, v4

    .line 41
    iget v1, p0, Lig1;->ε:I

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    sget-object v0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lig1;->λ:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, " \u00b7 \u4e92\u53d1\u6d88\u606f "

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, "/"

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p2, p0, Lig1;->θ:Llg1;

    .line 77
    .line 78
    invoke-static {p2}, Lpg1;->ο(Llg1;)Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-nez p2, :cond_2

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    iget-object p2, p0, Lig1;->η:Landroid/app/Activity;

    .line 86
    .line 87
    iget-object v0, p0, Lig1;->ι:Ljava/lang/String;

    .line 88
    .line 89
    iget-object p0, p0, Lig1;->κ:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {p2, v0, p0, p1, v1}, Lcom/example/dyhelper/ui/а;->ν(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 95
    .line 96
    return-object p0
.end method
