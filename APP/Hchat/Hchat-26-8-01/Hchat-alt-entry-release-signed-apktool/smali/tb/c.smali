.class public Ltb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x0

.field public static final Companion:Ltb/b;

.field private static final DEFAULT_CHANNELS:I = 0x1

.field public static final DEFAULT_HZ:I = 0x5dc0

.field private static final DEFAULT_SAMPLE_RATE:I = 0xac44

.field private static final SUPPORTED_SILK_HZ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final logger:Lfg/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfg/l;"
        }
    .end annotation
.end field

.field private final silkCodec$delegate:Lsf/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ltb/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltb/c;->Companion:Ltb/b;

    .line 7
    .line 8
    const/16 v0, 0x1f40

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0x2ee0

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/16 v2, 0x3e80

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/16 v3, 0x5dc0

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Ltb/c;->SUPPORTED_SILK_HZ:Ljava/util/Set;

    .line 41
    .line 42
    return-void
.end method

.method public constructor <init>(Lb0/d0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltb/c;->logger:Lfg/l;

    .line 5
    .line 6
    new-instance p1, Lk/s1;

    .line 7
    .line 8
    const/16 v0, 0xc

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lk/s1;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lsf/d;->g:Lsf/d;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Ltb/c;->silkCodec$delegate:Lsf/c;

    .line 20
    .line 21
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static d(I)I
    .locals 2

    .line 1
    sget-object v0, Ltb/c;->SUPPORTED_SILK_HZ:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    const/16 p0, 0x5dc0

    .line 15
    .line 16
    return p0
.end method


# virtual methods
.method public final a()Lme/yun/silk/SilkCodec;
    .locals 1

    .line 1
    iget-object v0, p0, Ltb/c;->silkCodec$delegate:Lsf/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    return-object v0
.end method

.method public final aacToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1, p2}, Lme/yun/silk/AacCodec;->aacToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    new-instance p2, Lsf/f;

    .line 24
    .line 25
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p1, p2

    .line 29
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string v0, "aacToPcm \u5931\u8d25: "

    .line 40
    .line 41
    invoke-static {v0, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/16 p1, -0x323

    .line 59
    .line 60
    :goto_1
    return p1

    .line 61
    :cond_3
    const/16 p1, -0xc

    .line 62
    .line 63
    return p1

    .line 64
    :cond_4
    const/16 p1, -0x321

    .line 65
    .line 66
    return p1
.end method

.method public final aacToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->aacToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "aacToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x407

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/16 p1, -0x321

    .line 73
    .line 74
    return p1
.end method

.method public final autoAacToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->autoAacToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "autoAacToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x407

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/4 p1, -0x1

    .line 73
    return p1
.end method

.method public final autoToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p3, p1}, Ltb/c;->b(ILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->autoToAac(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "autoToAac \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/4 p1, -0x2

    .line 67
    :goto_1
    return p1

    .line 68
    :cond_3
    const/16 p1, -0x385

    .line 69
    .line 70
    return p1

    .line 71
    :cond_4
    const/4 p1, -0x1

    .line 72
    return p1
.end method

.method public final autoToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p3, p1}, Ltb/c;->b(ILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->autoToM4a(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "autoToM4a \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/4 p1, -0x2

    .line 67
    :goto_1
    return p1

    .line 68
    :cond_3
    const/16 p1, -0x38f

    .line 69
    .line 70
    return p1

    .line 71
    :cond_4
    const/4 p1, -0x1

    .line 72
    return p1
.end method

.method public final autoToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, p2, v0}, Lme/yun/silk/AacCodec;->autoToPcmCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    new-instance p2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v0, "autoToPcm \u5931\u8d25: "

    .line 44
    .line 45
    invoke-static {v0, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/4 p1, -0x2

    .line 63
    :goto_1
    return p1

    .line 64
    :cond_3
    const/16 p1, -0xc

    .line 65
    .line 66
    return p1

    .line 67
    :cond_4
    const/4 p1, -0x1

    .line 68
    return p1
.end method

.method public final autoToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->autoToSilkCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "autoToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/4 p1, -0x2

    .line 67
    :goto_1
    return p1

    .line 68
    :cond_3
    const/16 p1, -0xa

    .line 69
    .line 70
    return p1

    .line 71
    :cond_4
    const/4 p1, -0x1

    .line 72
    return p1
.end method

.method public final b(ILjava/lang/String;)I
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p2

    .line 15
    new-instance v0, Lsf/f;

    .line 16
    .line 17
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p2, v0

    .line 21
    :goto_0
    const/4 v0, 0x0

    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    instance-of v1, p2, Lsf/f;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    move-object p2, v0

    .line 31
    :cond_0
    check-cast p2, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 v0, 0x1

    .line 38
    if-ne p2, v0, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Ltb/c;->d(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    if-lez p1, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const p1, 0xac44

    .line 49
    .line 50
    .line 51
    :goto_1
    return p1
.end method

.method public final decodeAacFile(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    invoke-static {p1, p2, v0}, Lme/yun/silk/AacCodec;->decodeAacFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    new-instance p2, Lsf/f;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p1, p2

    .line 30
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string v1, "decodeAacFile \u5931\u8d25: "

    .line 41
    .line 42
    invoke-static {v1, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object v0, p1

    .line 51
    :goto_1
    check-cast v0, Ljava/lang/Integer;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/16 p1, -0x323

    .line 61
    .line 62
    :goto_2
    return p1

    .line 63
    :cond_3
    const/16 p1, -0xc

    .line 64
    .line 65
    return p1

    .line 66
    :cond_4
    const/16 p1, -0x321

    .line 67
    .line 68
    return p1
.end method

.method public final decodeM4aFile(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    invoke-static {p1, p2, v0}, Lme/yun/silk/AacCodec;->decodeM4aFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    new-instance p2, Lsf/f;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p1, p2

    .line 30
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string v1, "decodeM4aFile \u5931\u8d25: "

    .line 41
    .line 42
    invoke-static {v1, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object v0, p1

    .line 51
    :goto_1
    check-cast v0, Ljava/lang/Integer;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/16 p1, -0x323

    .line 61
    .line 62
    :goto_2
    return p1

    .line 63
    :cond_3
    const/16 p1, -0xc

    .line 64
    .line 65
    return p1

    .line 66
    :cond_4
    const/16 p1, -0x321

    .line 67
    .line 68
    return p1
.end method

.method public final encodePcmToAac(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_6

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_5

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    if-lez p4, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 p4, 0x1

    .line 23
    :goto_1
    const/4 v0, 0x0

    .line 24
    :try_start_0
    invoke-static {p1, p2, p3, p4, v0}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    new-instance p2, Lsf/f;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p1, p2

    .line 40
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-string p3, "encodePcmToAac \u5931\u8d25: "

    .line 51
    .line 52
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    instance-of p2, p1, Lsf/f;

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    move-object v0, p1

    .line 61
    :goto_3
    check-cast v0, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    goto :goto_4

    .line 70
    :cond_4
    const/16 p1, -0x386

    .line 71
    .line 72
    :goto_4
    return p1

    .line 73
    :cond_5
    const/16 p1, -0xb

    .line 74
    .line 75
    return p1

    .line 76
    :cond_6
    const/16 p1, -0x385

    .line 77
    .line 78
    return p1
.end method

.method public final encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_5

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    if-lez p4, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 p4, 0x1

    .line 23
    :goto_1
    const/4 v0, 0x0

    .line 24
    :try_start_0
    invoke-static {p1, p2, p3, p4, v0}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    new-instance p2, Lsf/f;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p1, p2

    .line 40
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-string p3, "encodePcmToM4a \u5931\u8d25: "

    .line 51
    .line 52
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    instance-of p2, p1, Lsf/f;

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    move-object v0, p1

    .line 61
    :goto_3
    check-cast v0, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    goto :goto_4

    .line 70
    :cond_4
    const/16 p1, -0x390

    .line 71
    .line 72
    :goto_4
    return p1

    .line 73
    :cond_5
    const/16 p1, -0x38f

    .line 74
    .line 75
    return p1
.end method

.method public final flacToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1, p2}, Lme/yun/silk/SilkCodec;->flacToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    new-instance p2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v0, "flacToPcm \u5931\u8d25: "

    .line 44
    .line 45
    invoke-static {v0, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/16 p1, -0x259

    .line 63
    .line 64
    :goto_1
    return p1

    .line 65
    :cond_3
    const/16 p1, -0xc

    .line 66
    .line 67
    return p1

    .line 68
    :cond_4
    const/4 p1, -0x1

    .line 69
    return p1
.end method

.method public final flacToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lme/yun/silk/SilkCodec;->flacToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "flacToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x259

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/4 p1, -0x1

    .line 73
    return p1
.end method

.method public final getAudioInfo(Ljava/lang/String;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_6

    .line 6
    .line 7
    :try_start_0
    invoke-static {p1}, Lme/yun/silk/AacCodec;->getAudioInfo(Ljava/lang/String;)Lme/yun/silk/AacCodec$AudioInfo;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    new-instance v0, Lsf/f;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object p1, v0

    .line 19
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "\u8bfb\u53d6\u97f3\u9891\u4fe1\u606f\u5931\u8d25: "

    .line 30
    .line 31
    invoke-static {v1, v0, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    instance-of v0, p1, Lsf/f;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    move-object p1, v1

    .line 40
    :cond_1
    check-cast p1, Lme/yun/silk/AacCodec$AudioInfo;

    .line 41
    .line 42
    if-eqz p1, :cond_6

    .line 43
    .line 44
    const-string v0, "sampleRate"

    .line 45
    .line 46
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    instance-of v3, v2, Ljava/lang/Number;

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    check-cast v2, Ljava/lang/Number;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v2, v1

    .line 58
    :goto_1
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    const v2, 0xac44

    .line 66
    .line 67
    .line 68
    :goto_2
    const-string v3, "channelCount"

    .line 69
    .line 70
    invoke-static {p1, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    instance-of v4, p1, Ljava/lang/Number;

    .line 75
    .line 76
    if-eqz v4, :cond_4

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    check-cast v1, Ljava/lang/Number;

    .line 80
    .line 81
    :cond_4
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    const/4 p1, 0x1

    .line 89
    :goto_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v2, Lsf/e;

    .line 94
    .line 95
    invoke-direct {v2, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v0, Lsf/e;

    .line 103
    .line 104
    invoke-direct {v0, v3, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    filled-new-array {v2, v0}, [Lsf/e;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    :cond_6
    sget-object p1, Ltf/u;->g:Ltf/u;

    .line 117
    .line 118
    return-object p1
.end method

.method public final getDuration(Ljava/lang/String;)J
    .locals 4

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2, p1}, Lme/yun/silk/SilkCodec;->getDuration(Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    new-instance v2, Lsf/f;

    .line 24
    .line 25
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v2

    .line 29
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "getDuration \u5931\u8d25: "

    .line 40
    .line 41
    invoke-static {v3, v2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    instance-of v2, p1, Lsf/f;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    :cond_1
    check-cast p1, Ljava/lang/Long;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    :cond_2
    return-wide v0
.end method

.method public final getDurationLimited(Ljava/lang/String;)J
    .locals 4

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ltb/c;->getDuration(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/32 v2, 0xea60

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0

    .line 19
    :cond_0
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    return-wide v0
.end method

.method public final getErrorMessage(I)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "\u6210\u529f"

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, -0x1

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    const-string p1, "\u65e0\u6cd5\u83b7\u53d6\u6587\u4ef6\u6269\u5c55\u540d"

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    const/4 v0, -0x2

    .line 13
    if-ne p1, v0, :cond_2

    .line 14
    .line 15
    const-string p1, "\u4e0d\u652f\u6301\u7684\u97f3\u9891\u683c\u5f0f"

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_2
    const/4 v0, -0x3

    .line 19
    if-ne p1, v0, :cond_3

    .line 20
    .line 21
    const-string p1, "PCM \u8f6c Silk \u9700\u8981\u989d\u5916\u53c2\u6570"

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_3
    const/4 v0, -0x4

    .line 25
    if-ne p1, v0, :cond_4

    .line 26
    .line 27
    const-string p1, "\u8f93\u5165\u5df2\u7ecf\u662f PCM \u683c\u5f0f"

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_4
    const/4 v0, -0x5

    .line 31
    if-ne p1, v0, :cond_5

    .line 32
    .line 33
    const-string p1, "\u8f93\u5165\u5df2\u7ecf\u662f Silk \u683c\u5f0f"

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_5
    const/16 v0, -0xa

    .line 37
    .line 38
    if-ne p1, v0, :cond_6

    .line 39
    .line 40
    const-string p1, "\u8f93\u51fa\u5fc5\u987b\u662f .silk \u6216 .slk"

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_6
    const/16 v0, -0xb

    .line 44
    .line 45
    if-ne p1, v0, :cond_7

    .line 46
    .line 47
    const-string p1, "\u8f93\u51fa\u5fc5\u987b\u662f .mp3"

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_7
    const/16 v0, -0xc

    .line 51
    .line 52
    if-ne p1, v0, :cond_8

    .line 53
    .line 54
    const-string p1, "\u8f93\u51fa\u5fc5\u987b\u662f .pcm \u6216 .raw"

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_8
    const/16 v0, -0xd

    .line 58
    .line 59
    if-ne p1, v0, :cond_9

    .line 60
    .line 61
    const-string p1, "\u6587\u4ef6\u683c\u5f0f\u4e0e\u65b9\u6cd5\u4e0d\u5339\u914d"

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_9
    const/16 v0, -0xc9

    .line 65
    .line 66
    if-gt v0, p1, :cond_a

    .line 67
    .line 68
    if-ge p1, v0, :cond_a

    .line 69
    .line 70
    const-string p1, "Silk \u8f6c MP3 \u6587\u4ef6\u9519\u8bef"

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_a
    const/16 v0, -0x12d

    .line 74
    .line 75
    if-ne p1, v0, :cond_b

    .line 76
    .line 77
    const-string p1, "MP3 \u89e3\u7801\u9519\u8bef"

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_b
    const/16 v0, -0x12e

    .line 81
    .line 82
    if-ne p1, v0, :cond_c

    .line 83
    .line 84
    const-string p1, "MP3 \u6587\u4ef6\u9519\u8bef"

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_c
    const/16 v0, -0x191

    .line 88
    .line 89
    if-ne p1, v0, :cond_d

    .line 90
    .line 91
    const-string p1, "OGG \u89e3\u7801\u9519\u8bef"

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_d
    const/16 v0, -0x192

    .line 95
    .line 96
    if-ne p1, v0, :cond_e

    .line 97
    .line 98
    const-string p1, "OGG \u6587\u4ef6\u9519\u8bef"

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_e
    const/16 v0, -0x1f5

    .line 102
    .line 103
    if-ne p1, v0, :cond_f

    .line 104
    .line 105
    const-string p1, "WAV \u89e3\u7801\u9519\u8bef"

    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_f
    const/16 v0, -0x1f6

    .line 109
    .line 110
    if-ne p1, v0, :cond_10

    .line 111
    .line 112
    const-string p1, "WAV \u6587\u4ef6\u9519\u8bef"

    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_10
    const/16 v0, -0x259

    .line 116
    .line 117
    if-ne p1, v0, :cond_11

    .line 118
    .line 119
    const-string p1, "FLAC \u89e3\u7801\u9519\u8bef"

    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_11
    const/16 v0, -0x25a

    .line 123
    .line 124
    if-ne p1, v0, :cond_12

    .line 125
    .line 126
    const-string p1, "FLAC \u6587\u4ef6\u9519\u8bef"

    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_12
    const/16 v0, -0x2bd

    .line 130
    .line 131
    if-eq p1, v0, :cond_22

    .line 132
    .line 133
    const/16 v0, -0x2bf

    .line 134
    .line 135
    if-ne p1, v0, :cond_13

    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :cond_13
    const/16 v0, -0x2be

    .line 140
    .line 141
    if-ne p1, v0, :cond_14

    .line 142
    .line 143
    const-string p1, "PCM \u6587\u4ef6\u9519\u8bef"

    .line 144
    .line 145
    return-object p1

    .line 146
    :cond_14
    const/16 v0, -0x321

    .line 147
    .line 148
    if-ne p1, v0, :cond_15

    .line 149
    .line 150
    const-string p1, "AAC/M4A \u89e3\u7801\u9519\u8bef (\u6587\u4ef6\u4e0d\u5b58\u5728)"

    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_15
    const/16 v0, -0x322

    .line 154
    .line 155
    if-ne p1, v0, :cond_16

    .line 156
    .line 157
    const-string p1, "AAC/M4A \u89e3\u7801\u9519\u8bef (\u672a\u627e\u5230\u97f3\u9891\u8f68\u9053)"

    .line 158
    .line 159
    return-object p1

    .line 160
    :cond_16
    const/16 v0, -0x323

    .line 161
    .line 162
    if-ne p1, v0, :cond_17

    .line 163
    .line 164
    const-string p1, "AAC/M4A \u89e3\u7801\u9519\u8bef (\u683c\u5f0f\u4e0d\u652f\u6301)"

    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_17
    const/16 v0, -0x385

    .line 168
    .line 169
    if-gt v0, p1, :cond_18

    .line 170
    .line 171
    if-ge p1, v0, :cond_18

    .line 172
    .line 173
    const-string p1, "AAC \u7f16\u7801\u9519\u8bef"

    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_18
    const/16 v0, -0x38f

    .line 177
    .line 178
    if-gt v0, p1, :cond_19

    .line 179
    .line 180
    if-ge p1, v0, :cond_19

    .line 181
    .line 182
    const-string p1, "M4A \u7f16\u7801\u9519\u8bef"

    .line 183
    .line 184
    return-object p1

    .line 185
    :cond_19
    const/16 v0, -0x3e9

    .line 186
    .line 187
    if-gt v0, p1, :cond_1a

    .line 188
    .line 189
    const/16 v0, -0x3f0

    .line 190
    .line 191
    if-ge p1, v0, :cond_1a

    .line 192
    .line 193
    const-string p1, "Silk \u8f6c AAC/M4A \u9519\u8bef"

    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_1a
    const/16 v0, -0x3f3

    .line 197
    .line 198
    if-gt v0, p1, :cond_1b

    .line 199
    .line 200
    if-ge p1, v0, :cond_1b

    .line 201
    .line 202
    const-string p1, "MP3 \u8f6c AAC/M4A \u9519\u8bef"

    .line 203
    .line 204
    return-object p1

    .line 205
    :cond_1b
    const/16 v0, -0x3fd

    .line 206
    .line 207
    if-gt v0, p1, :cond_1c

    .line 208
    .line 209
    if-ge p1, v0, :cond_1c

    .line 210
    .line 211
    const-string p1, "WAV \u8f6c AAC/M4A \u9519\u8bef"

    .line 212
    .line 213
    return-object p1

    .line 214
    :cond_1c
    const/16 v0, -0x407

    .line 215
    .line 216
    if-gt v0, p1, :cond_1d

    .line 217
    .line 218
    const/16 v0, -0x40e

    .line 219
    .line 220
    if-ge p1, v0, :cond_1d

    .line 221
    .line 222
    const-string p1, "M4A/AAC \u8f6c Silk \u9519\u8bef"

    .line 223
    .line 224
    return-object p1

    .line 225
    :cond_1d
    const/16 v0, -0x41b

    .line 226
    .line 227
    if-gt v0, p1, :cond_1e

    .line 228
    .line 229
    const/16 v0, -0x422

    .line 230
    .line 231
    if-ge p1, v0, :cond_1e

    .line 232
    .line 233
    const-string p1, "M4A/AAC \u8f6c AAC \u9519\u8bef"

    .line 234
    .line 235
    return-object p1

    .line 236
    :cond_1e
    const/16 v0, -0x425

    .line 237
    .line 238
    if-gt v0, p1, :cond_1f

    .line 239
    .line 240
    const/16 v0, -0x42c

    .line 241
    .line 242
    if-ge p1, v0, :cond_1f

    .line 243
    .line 244
    const-string p1, "M4A/AAC \u8f6c M4A \u9519\u8bef"

    .line 245
    .line 246
    return-object p1

    .line 247
    :cond_1f
    const/16 v0, -0x7d0

    .line 248
    .line 249
    if-ne p1, v0, :cond_20

    .line 250
    .line 251
    const-string p1, "M4A/AAC \u8f6c Silk \u9519\u8bef (\u89e3\u7801\u5931\u8d25)"

    .line 252
    .line 253
    return-object p1

    .line 254
    :cond_20
    :try_start_0
    invoke-static {p1}, Lme/yun/silk/AacCodec;->getErrorMessage(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    goto :goto_0

    .line 259
    :catchall_0
    move-exception v0

    .line 260
    new-instance v1, Lsf/f;

    .line 261
    .line 262
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    move-object v0, v1

    .line 266
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-nez v1, :cond_21

    .line 271
    .line 272
    goto :goto_1

    .line 273
    :cond_21
    const-string v0, "\u9519\u8bef\u7801: "

    .line 274
    .line 275
    const-string v1, " -> \u672a\u77e5\u9519\u8bef"

    .line 276
    .line 277
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 282
    .line 283
    return-object v0

    .line 284
    :cond_22
    :goto_2
    const-string p1, "PCM \u53c2\u6570\u9519\u8bef"

    .line 285
    .line 286
    return-object p1
.end method

.method public final getFileType(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    new-instance v1, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v1

    .line 28
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "getFileType \u5931\u8d25: "

    .line 39
    .line 40
    invoke-static {v2, v1, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    instance-of v1, p1, Lsf/f;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :cond_2
    return v0
.end method

.method public final log(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltb/c;->logger:Lfg/l;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final m4aToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_4

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    :try_start_0
    invoke-static {p1, p2, p3}, Lme/yun/silk/AacCodec;->m4aToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    new-instance p2, Lsf/f;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, p2

    .line 35
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "m4aToAac \u5931\u8d25: "

    .line 46
    .line 47
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    instance-of p2, p1, Lsf/f;

    .line 51
    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    :cond_2
    check-cast p1, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const/16 p1, -0x41b

    .line 65
    .line 66
    :goto_2
    return p1

    .line 67
    :cond_4
    const/16 p1, -0x385

    .line 68
    .line 69
    return p1

    .line 70
    :cond_5
    const/16 p1, -0x321

    .line 71
    .line 72
    return p1
.end method

.method public final m4aToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_4

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    :try_start_0
    invoke-static {p1, p2, p3}, Lme/yun/silk/AacCodec;->m4aToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    new-instance p2, Lsf/f;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, p2

    .line 35
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "m4aToM4a \u5931\u8d25: "

    .line 46
    .line 47
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    instance-of p2, p1, Lsf/f;

    .line 51
    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    :cond_2
    check-cast p1, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const/16 p1, -0x425

    .line 65
    .line 66
    :goto_2
    return p1

    .line 67
    :cond_4
    const/16 p1, -0x38f

    .line 68
    .line 69
    return p1

    .line 70
    :cond_5
    const/16 p1, -0x321

    .line 71
    .line 72
    return p1
.end method

.method public final m4aToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1, p2}, Lme/yun/silk/AacCodec;->m4aToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    new-instance p2, Lsf/f;

    .line 24
    .line 25
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p1, p2

    .line 29
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string v0, "m4aToPcm \u5931\u8d25: "

    .line 40
    .line 41
    invoke-static {v0, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/16 p1, -0x323

    .line 59
    .line 60
    :goto_1
    return p1

    .line 61
    :cond_3
    const/16 p1, -0xc

    .line 62
    .line 63
    return p1

    .line 64
    :cond_4
    const/16 p1, -0x321

    .line 65
    .line 66
    return p1
.end method

.method public final m4aToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->m4aToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "m4aToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x407

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/16 p1, -0x321

    .line 73
    .line 74
    return p1
.end method

.method public final mp3ToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1, p2}, Lme/yun/silk/SilkCodec;->mp3ToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    new-instance p2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v0, "mp3ToPcm \u5931\u8d25: "

    .line 44
    .line 45
    invoke-static {v0, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/16 p1, -0x12d

    .line 63
    .line 64
    :goto_1
    return p1

    .line 65
    :cond_3
    const/16 p1, -0xc

    .line 66
    .line 67
    return p1

    .line 68
    :cond_4
    const/4 p1, -0x1

    .line 69
    return p1
.end method

.method public final mp3ToSilk(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const/16 v0, 0x5dc0

    .line 74
    invoke-virtual {p0, p1, p2, v0}, Ltb/c;->mp3ToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final mp3ToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lme/yun/silk/SilkCodec;->mp3ToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "mp3ToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x12d

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/4 p1, -0x1

    .line 73
    return p1
.end method

.method public final mp4ToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_4

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    :try_start_0
    invoke-static {p1, p2, p3}, Lme/yun/silk/AacCodec;->mp4ToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    new-instance p2, Lsf/f;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, p2

    .line 35
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "mp4ToAac \u5931\u8d25: "

    .line 46
    .line 47
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    instance-of p2, p1, Lsf/f;

    .line 51
    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    :cond_2
    check-cast p1, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const/16 p1, -0x41b

    .line 65
    .line 66
    :goto_2
    return p1

    .line 67
    :cond_4
    const/16 p1, -0x385

    .line 68
    .line 69
    return p1

    .line 70
    :cond_5
    const/16 p1, -0x321

    .line 71
    .line 72
    return p1
.end method

.method public final mp4ToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_4

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    :try_start_0
    invoke-static {p1, p2, p3}, Lme/yun/silk/AacCodec;->mp4ToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    new-instance p2, Lsf/f;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, p2

    .line 35
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "mp4ToM4a \u5931\u8d25: "

    .line 46
    .line 47
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    instance-of p2, p1, Lsf/f;

    .line 51
    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    :cond_2
    check-cast p1, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const/16 p1, -0x425

    .line 65
    .line 66
    :goto_2
    return p1

    .line 67
    :cond_4
    const/16 p1, -0x38f

    .line 68
    .line 69
    return p1

    .line 70
    :cond_5
    const/16 p1, -0x321

    .line 71
    .line 72
    return p1
.end method

.method public final mp4ToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->mp4ToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "mp4ToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x407

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/16 p1, -0x321

    .line 73
    .line 74
    return p1
.end method

.method public final oggToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, p2, v0}, Lme/yun/silk/AacCodec;->oggToPcmCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    new-instance p2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v0, "oggToPcm \u5931\u8d25: "

    .line 44
    .line 45
    invoke-static {v0, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/16 p1, -0x191

    .line 63
    .line 64
    :goto_1
    return p1

    .line 65
    :cond_3
    const/16 p1, -0xc

    .line 66
    .line 67
    return p1

    .line 68
    :cond_4
    const/4 p1, -0x1

    .line 69
    return p1
.end method

.method public final oggToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p1, p2, v0, p3}, Lme/yun/silk/AacCodec;->oggToSilkCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "oggToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x191

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/4 p1, -0x1

    .line 73
    return p1
.end method

.method public final pcmToAac(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 0

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_5

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    if-lez p4, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 p4, 0x1

    .line 23
    :goto_1
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lme/yun/silk/AacCodec;->pcmToAac(Ljava/lang/String;Ljava/lang/String;II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_2

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    new-instance p2, Lsf/f;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p1, p2

    .line 39
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string p3, "pcmToAac \u5931\u8d25: "

    .line 50
    .line 51
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    instance-of p2, p1, Lsf/f;

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    :cond_3
    check-cast p1, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 p1, -0x386

    .line 69
    .line 70
    :goto_3
    return p1

    .line 71
    :cond_5
    const/16 p1, -0x385

    .line 72
    .line 73
    return p1
.end method

.method public final pcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 0

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_5

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const p3, 0xac44

    .line 17
    .line 18
    .line 19
    :goto_0
    if-lez p4, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 p4, 0x1

    .line 23
    :goto_1
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lme/yun/silk/AacCodec;->pcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_2

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    new-instance p2, Lsf/f;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p1, p2

    .line 39
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string p3, "pcmToM4a \u5931\u8d25: "

    .line 50
    .line 51
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    instance-of p2, p1, Lsf/f;

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    :cond_3
    check-cast p1, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 p1, -0x390

    .line 69
    .line 70
    :goto_3
    return p1

    .line 71
    :cond_5
    const/16 p1, -0x38f

    .line 72
    .line 73
    return p1
.end method

.method public final pcmToSilk(Ljava/lang/String;Ljava/lang/String;III)I
    .locals 6

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-eqz v1, :cond_6

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_5

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-lez p4, :cond_0

    .line 22
    .line 23
    :goto_0
    move v4, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const p4, 0xac44

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    if-lez p5, :cond_1

    .line 30
    .line 31
    :goto_2
    move v5, p5

    .line 32
    goto :goto_3

    .line 33
    :cond_1
    const/4 p5, 0x1

    .line 34
    goto :goto_2

    .line 35
    :goto_3
    invoke-virtual/range {v0 .. v5}, Lme/yun/silk/SilkCodec;->pcmToSilk(Ljava/lang/String;Ljava/lang/String;III)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_4

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    new-instance p2, Lsf/f;

    .line 47
    .line 48
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object p1, p2

    .line 52
    :goto_4
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    const-string p3, "pcmToSilk \u5931\u8d25: "

    .line 63
    .line 64
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    instance-of p2, p1, Lsf/f;

    .line 68
    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    :cond_3
    check-cast p1, Ljava/lang/Integer;

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    goto :goto_5

    .line 81
    :cond_4
    const/16 p1, -0x2bd

    .line 82
    .line 83
    :goto_5
    return p1

    .line 84
    :cond_5
    const/16 p1, -0xa

    .line 85
    .line 86
    return p1

    .line 87
    :cond_6
    const/4 p1, -0x1

    .line 88
    return p1
.end method

.method public final silkToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/16 v0, -0x3e9

    .line 6
    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_3

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-static {p1, p2, v1, p3}, Lme/yun/silk/AacCodec;->silkToAac(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    new-instance p2, Lsf/f;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p1, p2

    .line 39
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string p3, "silkToAac \u5931\u8d25: "

    .line 50
    .line 51
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 55
    .line 56
    if-eqz p2, :cond_1

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    :cond_2
    return v0

    .line 68
    :cond_3
    const/16 p1, -0x385

    .line 69
    .line 70
    return p1

    .line 71
    :cond_4
    return v0
.end method

.method public final silkToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/16 v0, -0x3e9

    .line 6
    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_3

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-static {p1, p2, v1, p3}, Lme/yun/silk/AacCodec;->silkToM4a(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    new-instance p2, Lsf/f;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p1, p2

    .line 39
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string p3, "silkToM4a \u5931\u8d25: "

    .line 50
    .line 51
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 55
    .line 56
    if-eqz p2, :cond_1

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    :cond_2
    return v0

    .line 68
    :cond_3
    const/16 p1, -0x38f

    .line 69
    .line 70
    return p1

    .line 71
    :cond_4
    return v0
.end method

.method public final silkToMp3(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const/16 v0, 0x5dc0

    .line 74
    invoke-virtual {p0, p1, p2, v0}, Ltb/c;->silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lme/yun/silk/SilkCodec;->silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "silkToMp3 \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0xc9

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xb

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/4 p1, -0x1

    .line 73
    return p1
.end method

.method public final silkToPcm(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lme/yun/silk/SilkCodec;->silkToPcm(Ljava/lang/String;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "silkToPcm \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0xc9

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xc

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/4 p1, -0x1

    .line 73
    return p1
.end method

.method public final startTransform(ILjava/lang/String;Ljava/lang/String;ILjava/util/function/Consumer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    if-eqz v3, :cond_1

    .line 6
    .line 7
    invoke-static {p3}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    invoke-static {p4}, Ltb/c;->d(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-lez p4, :cond_0

    .line 18
    .line 19
    :goto_0
    move v6, p4

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const p4, 0xac44

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    new-instance p2, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v0, Ltb/a;

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    move v1, p1

    .line 31
    move-object v7, p5

    .line 32
    invoke-direct/range {v0 .. v7}, Ltb/a;-><init>(ILtb/c;Ljava/lang/String;Ljava/lang/String;IILjava/util/function/Consumer;)V

    .line 33
    .line 34
    .line 35
    const-string p1, "Hchat-Audio-Transform"

    .line 36
    .line 37
    invoke-direct {p2, v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final wavToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1, p2}, Lme/yun/silk/SilkCodec;->wavToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    new-instance p2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v0, "wavToPcm \u5931\u8d25: "

    .line 44
    .line 45
    invoke-static {v0, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/16 p1, -0x1f5

    .line 63
    .line 64
    :goto_1
    return p1

    .line 65
    :cond_3
    const/16 p1, -0xc

    .line 66
    .line 67
    return p1

    .line 68
    :cond_4
    const/4 p1, -0x1

    .line 69
    return p1
.end method

.method public final wavToSilk(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Ltb/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Ltb/c;->a()Lme/yun/silk/SilkCodec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p3}, Ltb/c;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lme/yun/silk/SilkCodec;->wavToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance p2, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, p2

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "wavToSilk \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {p3, p2, p0}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    instance-of p2, p1, Lsf/f;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    :cond_1
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, -0x1f5

    .line 67
    .line 68
    :goto_1
    return p1

    .line 69
    :cond_3
    const/16 p1, -0xa

    .line 70
    .line 71
    return p1

    .line 72
    :cond_4
    const/4 p1, -0x1

    .line 73
    return p1
.end method
