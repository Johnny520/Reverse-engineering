.class public final Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    return-object v0
.end method
