.class public final Ln7/c;
.super Ln7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Ln7/c;

.field public static final c:Ln7/c;

.field public static final d:Ln7/c;

.field public static final e:Ln7/c;


# instance fields
.field public final a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln7/c;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Ln7/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln7/c;->b:Ln7/c;

    .line 8
    .line 9
    new-instance v0, Ln7/c;

    .line 10
    .line 11
    const/16 v1, 0x9

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ln7/c;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ln7/c;->c:Ln7/c;

    .line 17
    .line 18
    new-instance v0, Ln7/c;

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-direct {v0, v1}, Ln7/c;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ln7/c;->d:Ln7/c;

    .line 25
    .line 26
    new-instance v0, Ln7/c;

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-direct {v0, v1}, Ln7/c;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ln7/c;->e:Ln7/c;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ln7/c;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "#"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Ln7/c;->a:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, -0x2

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x4

    .line 19
    :goto_0
    mul-int/2addr v1, v2

    .line 20
    :goto_1
    if-ltz v1, :cond_2

    .line 21
    .line 22
    shr-int v3, p1, v1

    .line 23
    .line 24
    and-int/lit8 v3, v3, 0xf

    .line 25
    .line 26
    const/16 v4, 0xa

    .line 27
    .line 28
    if-ge v3, v4, :cond_1

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x30

    .line 31
    .line 32
    :goto_2
    int-to-char v3, v3

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    add-int/lit8 v3, v3, 0x57

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :goto_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method
