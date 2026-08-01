.class public final Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(B)Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Build:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x1

    .line 7
    if-ne p1, p0, :cond_1

    .line 8
    .line 9
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Runtime:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 p0, 0x2

    .line 13
    if-ne p1, p0, :cond_2

    .line 14
    .line 15
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->System:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 p0, 0x3

    .line 19
    if-ne p1, p0, :cond_3

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_3
    const-string p0, "Unknown AnnotationVisibilityType: "

    .line 24
    .line 25
    invoke-static {p0, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method
