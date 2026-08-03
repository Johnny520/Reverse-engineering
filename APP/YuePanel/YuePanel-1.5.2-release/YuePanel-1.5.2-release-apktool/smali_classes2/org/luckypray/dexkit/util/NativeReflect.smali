.class public final Lorg/luckypray/dexkit/util/NativeReflect;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 \u00a2\u0006\u0002\u0010\u000cJ8\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 \u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lorg/luckypray/dexkit/util/NativeReflect;",
        "",
        "()V",
        "getReflectedField",
        "Ljava/lang/reflect/Field;",
        "declaringClass",
        "Ljava/lang/Class;",
        "name",
        "",
        "jniSig",
        "isStatic",
        "",
        "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;",
        "getReflectedMethod",
        "Ljava/lang/reflect/Member;",
        "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/util/NativeReflect;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/util/NativeReflect;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/NativeReflect;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/NativeReflect;->INSTANCE:Lorg/luckypray/dexkit/util/NativeReflect;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native getReflectedField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;
    .param p0    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation
.end method

.method public static synthetic getReflectedField$default(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Field;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method public static final native getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;
    .param p0    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Ljava/lang/reflect/Member;"
        }
    .end annotation
.end method

.method public static synthetic getReflectedMethod$default(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Member;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;

    move-result-object p0

    return-object p0
.end method
