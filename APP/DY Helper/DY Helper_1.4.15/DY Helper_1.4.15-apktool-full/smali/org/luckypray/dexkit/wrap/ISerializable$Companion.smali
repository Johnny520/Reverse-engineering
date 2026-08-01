.class public final Lorg/luckypray/dexkit/wrap/ISerializable$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/wrap/ISerializable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->$$INSTANCE:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x6

    .line 5
    const-string v0, "->"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p1, v0, v1, v1, p0}, Lq02;->д(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v0, -0x1

    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    new-instance p0, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/wrap/DexClass;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    const-string v3, ":"

    .line 25
    .line 26
    invoke-static {p1, v3, p0, v1, v2}, Lq02;->д(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ne p0, v0, :cond_1

    .line 31
    .line 32
    new-instance p0, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 33
    .line 34
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    new-instance p0, Lorg/luckypray/dexkit/wrap/DexField;

    .line 39
    .line 40
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method public final deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
