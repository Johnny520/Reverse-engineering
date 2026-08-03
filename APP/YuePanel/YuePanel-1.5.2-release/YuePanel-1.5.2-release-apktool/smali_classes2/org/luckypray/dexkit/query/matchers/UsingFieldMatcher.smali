.class public final Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0018\u0000 h2\u00020\u0001:\u0001hB\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008B\u001b\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0005\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008!\u0010\"J\u0019\u0010!\u001a\u00020\u00002\n\u0010$\u001a\u0006\u0012\u0002\u0008\u00030#\u00a2\u0006\u0004\u0008!\u0010%J+\u0010!\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0015\u0010\'\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020 \u00a2\u0006\u0004\u0008\'\u0010\"J\u0019\u0010\'\u001a\u00020\u00002\n\u0010$\u001a\u0006\u0012\u0002\u0008\u00030#\u00a2\u0006\u0004\u0008\'\u0010%J+\u0010\'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\'\u0010\u0019J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008*\u0010+J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u001d\u00a2\u0006\u0004\u00081\u00102J\u0015\u00101\u001a\u00020\u00002\u0006\u00104\u001a\u000203\u00a2\u0006\u0004\u00081\u00105J\u0015\u00101\u001a\u00020\u00002\u0006\u00104\u001a\u000206\u00a2\u0006\u0004\u00081\u00107J!\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u00108\u001a\u00020\u001d2\u0008\u0008\u0002\u00109\u001a\u00020\u001d\u00a2\u0006\u0004\u00081\u0010:J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>\u00a2\u0006\u0004\u0008@\u0010AJ\u0015\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\t\u00a2\u0006\u0004\u0008@\u0010\u0011J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020;\u00a2\u0006\u0004\u0008D\u0010=J\u0015\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020>\u00a2\u0006\u0004\u0008F\u0010AJ\u0015\u0010F\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\t\u00a2\u0006\u0004\u0008F\u0010\u0011J&\u0010\u0005\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008\u0005\u0010KJ&\u0010!\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008!\u0010KJ&\u0010\'\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008\'\u0010KJ&\u0010*\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008*\u0010KJ&\u0010.\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008.\u0010KJ&\u0010<\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008<\u0010KJ&\u0010@\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008@\u0010KJ&\u0010D\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008D\u0010KJ&\u0010F\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0002\u0008I\u00a2\u0006\u0004\u0008F\u0010KJ\u0017\u0010N\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020LH\u0014\u00a2\u0006\u0004\u0008N\u0010OR(\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010P\u001a\u0004\u0018\u00010\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010Q\u001a\u0004\u0008R\u0010SR*\u0010\u0007\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010T\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR$\u0010\u0010\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Z\u0010[\"\u0004\u0008\\\u0010]R$\u0010\u0013\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008^\u0010[\"\u0004\u0008_\u0010]R$\u0010\u001b\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020\u001d8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR$\u0010!\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008d\u0010[\"\u0004\u0008e\u0010]R$\u0010\'\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008f\u0010[\"\u0004\u0008g\u0010]\u00a8\u0006i"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseMatcher;",
        "<init>",
        "()V",
        "Ljava/lang/reflect/Field;",
        "field",
        "Lorg/luckypray/dexkit/query/enums/UsingType;",
        "usingType",
        "(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V",
        "",
        "fieldDescriptor",
        "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "matcher",
        "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "descriptor",
        "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "name",
        "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "matchType",
        "",
        "ignoreCase",
        "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "modifiers",
        "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "declaredClass",
        "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Ljava/lang/Class;",
        "clazz",
        "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "className",
        "type",
        "typeName",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "annotations",
        "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "annotation",
        "addAnnotation",
        "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "count",
        "annotationCount",
        "(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "range",
        "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;",
        "(LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "min",
        "max",
        "(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
        "readMethods",
        "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "readMethod",
        "addReadMethods",
        "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "methodDescriptor",
        "putMethods",
        "writeMethods",
        "putMethod",
        "addWriteMethod",
        "Lkotlin/Function1;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "LYue/\u06e5\u06e0\u06e1\u06e5\u06e7;",
        "init",
        "(LYue/\u06e5\u06e0\u06e3\u06e1\u06df;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "fbb",
        "innerBuild",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;)I",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "getMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "Lorg/luckypray/dexkit/query/enums/UsingType;",
        "getUsingType",
        "()Lorg/luckypray/dexkit/query/enums/UsingType;",
        "setUsingType",
        "(Lorg/luckypray/dexkit/query/enums/UsingType;)V",
        "value",
        "getDescriptor",
        "()Ljava/lang/String;",
        "setDescriptor",
        "(Ljava/lang/String;)V",
        "getName",
        "setName",
        "getModifiers",
        "()I",
        "setModifiers",
        "(I)V",
        "getDeclaredClass",
        "setDeclaredClass",
        "getType",
        "setType",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field private usingType:Lorg/luckypray/dexkit/query/enums/UsingType;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/UsingType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fieldDescriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 10
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 11
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 12
    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 1
    .param p1    # Ljava/lang/reflect/Field;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/UsingType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "field"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 4
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/reflect/Field;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 6
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 7
    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V

    return-void
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic addAnnotation(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "annotation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 2
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic addReadMethods(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addReadMethods(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final addReadMethods(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 4
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addReadMethods(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "readMethod"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 2
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic addWriteMethod(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final addWriteMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 4
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "putMethod"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 2
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 2
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 7
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 8
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "range"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 6
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "range"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 4
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic annotations(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "annotations"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 2
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic declaredClass(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 6
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    const-string v0, "className"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    const-string v0, "className"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "className"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 8
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "declaredClass"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 4
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    move-result-object v2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final synthetic field(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "matcher"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic getDeclaredClass()Ljava/lang/String;
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Property can only be written."
    .end annotation

    new-instance v0, LYue/ۥۡۢۥ۟;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYue/ۥۡۢۥ۟;-><init>(Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    throw v0
.end method

.method public final synthetic getDescriptor()Ljava/lang/String;
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Property can only be written."
    .end annotation

    new-instance v0, LYue/ۥۡۢۥ۟;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYue/ۥۡۢۥ۟;-><init>(Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    throw v0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object v0
.end method

.method public final synthetic getModifiers()I
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Property can only be written."
    .end annotation

    new-instance v0, LYue/ۥۡۢۥ۟;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYue/ۥۡۢۥ۟;-><init>(Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    throw v0
.end method

.method public final synthetic getName()Ljava/lang/String;
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Property can only be written."
    .end annotation

    new-instance v0, LYue/ۥۡۢۥ۟;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYue/ۥۡۢۥ۟;-><init>(Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    throw v0
.end method

.method public final synthetic getType()Ljava/lang/String;
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Property can only be written."
    .end annotation

    new-instance v0, LYue/ۥۡۢۥ۟;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYue/ۥۡۢۥ۟;-><init>(Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    throw v0
.end method

.method public final getUsingType()Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-object v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 3
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fbb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-eqz v0, :cond_0

    sget-object v1, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/schema/-UsingFieldMatcher$Companion;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/UsingType;->getValue()B

    move-result v2

    invoke-virtual {v1, p1, v0, v2}, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher$Companion;->createUsingFieldMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "UsingFieldMatcher matcher not set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p2    # Lorg/luckypray/dexkit/query/enums/MatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "modifiers"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 3
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 6
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 4
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic readMethods(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "readMethods"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 2
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final synthetic setDeclaredClass(Ljava/lang/String;)V
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-void
.end method

.method public final synthetic setDescriptor(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-void
.end method

.method public final synthetic setName(Ljava/lang/String;)V
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-void
.end method

.method public final synthetic setType(Ljava/lang/String;)V
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-void
.end method

.method public final synthetic setUsingType(Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-void
.end method

.method public final synthetic type(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 6
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    const-string v0, "typeName"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    const-string v0, "typeName"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "typeName"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 8
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 4
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/enums/UsingType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "usingType"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-object p0
.end method

.method public final synthetic writeMethods(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object p0
.end method

.method public final writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "putMethods"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 2
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method
