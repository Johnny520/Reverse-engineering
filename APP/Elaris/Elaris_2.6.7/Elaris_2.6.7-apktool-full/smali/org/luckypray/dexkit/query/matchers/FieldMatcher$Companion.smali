.class public final Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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

.method public synthetic constructor <init>(Lr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final create()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 10
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    return-object p0
.end method

.method public final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public final create(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/reflect/Field;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method
