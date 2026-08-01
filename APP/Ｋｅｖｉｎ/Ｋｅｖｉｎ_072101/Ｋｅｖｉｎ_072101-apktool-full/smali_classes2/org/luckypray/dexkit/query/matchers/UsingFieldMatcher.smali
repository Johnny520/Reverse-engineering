.class public final Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "UsingFieldMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 R2\u00020\u0001:\u0001RB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0019\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J%\u0010)\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u000e\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\tJ\u000e\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u000203J%\u00100\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u000e\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u00020\tJ\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u000203J%\u00104\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0019J\u001a\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u00108\u001a\u00020\u00192\u0008\u0008\u0002\u00109\u001a\u00020\u0019J\u000e\u00106\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u00106\u001a\u00020\u00002\u0006\u0010:\u001a\u00020<J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>J%\u0010=\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u0012\u0010\u000c\u001a\u00020\u00002\n\u0010?\u001a\u0006\u0012\u0002\u0008\u00030@J$\u0010\u000c\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\t2\u0008\u0008\u0002\u0010B\u001a\u00020C2\u0008\u0008\u0002\u0010D\u001a\u00020EH\u0007J\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020FJ%\u0010\u000c\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J%\u0010\u0003\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010G\u001a\u00020\u00192\u0006\u0010H\u001a\u00020IH\u0014J\u001a\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010B\u001a\u00020JH\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020KJ$\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\t2\u0008\u0008\u0002\u0010B\u001a\u00020C2\u0008\u0008\u0002\u0010D\u001a\u00020EH\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020LJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010M\u001a\u00020NJ%\u0010M\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u0012\u0010\"\u001a\u00020\u00002\n\u0010?\u001a\u0006\u0012\u0002\u0008\u00030@J$\u0010\"\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\t2\u0008\u0008\u0002\u0010B\u001a\u00020C2\u0008\u0008\u0002\u0010D\u001a\u00020EH\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020FJ%\u0010\"\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020NJ%\u0010P\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00f8\u0001\u0000R$\u0010\u000c\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0012\u0010\u000e\"\u0004\u0008\u0013\u0010\u0010R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00198G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010\u000e\"\u0004\u0008!\u0010\u0010R$\u0010\"\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008#\u0010\u000e\"\u0004\u0008$\u0010\u0010R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006S"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "field",
        "Ljava/lang/reflect/Field;",
        "usingType",
        "Lorg/luckypray/dexkit/query/enums/UsingType;",
        "(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V",
        "fieldDescriptor",
        "",
        "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V",
        "value",
        "declaredClass",
        "getDeclaredClass",
        "()Ljava/lang/String;",
        "setDeclaredClass",
        "(Ljava/lang/String;)V",
        "descriptor",
        "getDescriptor",
        "setDescriptor",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "matcher",
        "getMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "",
        "modifiers",
        "getModifiers",
        "()I",
        "setModifiers",
        "(I)V",
        "name",
        "getName",
        "setName",
        "type",
        "getType",
        "setType",
        "getUsingType",
        "()Lorg/luckypray/dexkit/query/enums/UsingType;",
        "setUsingType",
        "(Lorg/luckypray/dexkit/query/enums/UsingType;)V",
        "addAnnotation",
        "annotation",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addReadMethods",
        "methodDescriptor",
        "readMethod",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "addWriteMethod",
        "putMethod",
        "annotationCount",
        "count",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "annotations",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "clazz",
        "Ljava/lang/Class;",
        "className",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "readMethods",
        "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
        "typeName",
        "writeMethods",
        "putMethods",
        "Companion",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;


# instance fields
.field private matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

.field private usingType:Lorg/luckypray/dexkit/query/enums/UsingType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 46
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 1
    .param p1, "fieldDescriptor"    # Ljava/lang/String;
    .param p2, "usingType"    # Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v0, "fieldDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 46
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 54
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 55
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 56
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 53
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V

    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/reflect/Field;
    .param p2, "usingType"    # Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 46
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 50
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/reflect/Field;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 51
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 52
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 49
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V

    .line 52
    return-void
.end method

.method private final addAnnotation(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 571
    .local v1, "$i$a$-also-UsingFieldMatcher$addAnnotation$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 572
    nop

    .line 570
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addAnnotation$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 572
    return-object v0
.end method

.method private final addReadMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 586
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 587
    .local v1, "$i$a$-also-UsingFieldMatcher$addReadMethods$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addReadMethods(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 588
    nop

    .line 586
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addReadMethods$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 588
    return-object v0
.end method

.method private final addWriteMethod(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 602
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 603
    .local v1, "$i$a$-also-UsingFieldMatcher$addWriteMethod$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 604
    nop

    .line 602
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addWriteMethod$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 604
    return-object v0
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    .line 438
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

.method private final annotations(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 562
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 563
    .local v1, "$i$a$-also-UsingFieldMatcher$annotations$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 564
    nop

    .line 562
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$annotations$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 564
    return-object v0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method private final declaredClass(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 547
    .local v1, "$i$a$-also-UsingFieldMatcher$declaredClass$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 548
    nop

    .line 546
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$declaredClass$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 548
    return-object v0
.end method

.method public static synthetic declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    .line 295
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 297
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 295
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 298
    const/4 p3, 0x0

    .line 295
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final field(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 539
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 540
    .local v1, "$i$a$-also-UsingFieldMatcher$field$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 541
    nop

    .line 539
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$field$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 541
    return-object v0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    .line 244
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 246
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 244
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    .line 208
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 210
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 208
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 211
    const/4 p3, 0x0

    .line 208
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final readMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 578
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 579
    .local v1, "$i$a$-also-UsingFieldMatcher$readMethods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 580
    nop

    .line 578
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$readMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 580
    return-object v0
.end method

.method private final type(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 554
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 555
    .local v1, "$i$a$-also-UsingFieldMatcher$type$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 556
    nop

    .line 554
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$type$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 556
    return-object v0
.end method

.method public static synthetic type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 0

    .line 345
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 347
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 345
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 348
    const/4 p3, 0x0

    .line 345
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final writeMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 594
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 595
    .local v1, "$i$a$-also-UsingFieldMatcher$writeMethods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 596
    nop

    .line 594
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$writeMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 596
    return-object v0
.end method


# virtual methods
.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "annotation"    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 380
    .local v1, "$i$a$-also-UsingFieldMatcher$addAnnotation$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 381
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 382
    nop

    .line 379
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addAnnotation$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 382
    return-object v0
.end method

.method public final addReadMethods(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 4
    .param p1, "methodDescriptor"    # Ljava/lang/String;

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 484
    .local v1, "$i$a$-also-UsingFieldMatcher$addReadMethods$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 485
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 486
    nop

    .line 483
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addReadMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 486
    return-object v0
.end method

.method public final addReadMethods(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "readMethod"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "readMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 469
    .local v1, "$i$a$-also-UsingFieldMatcher$addReadMethods$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 470
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 471
    nop

    .line 468
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addReadMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 471
    return-object v0
.end method

.method public final addWriteMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 4
    .param p1, "methodDescriptor"    # Ljava/lang/String;

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 529
    .local v1, "$i$a$-also-UsingFieldMatcher$addWriteMethod$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 530
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 531
    nop

    .line 528
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addWriteMethod$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 531
    return-object v0
.end method

.method public final addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "putMethod"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "putMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 513
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 514
    .local v1, "$i$a$-also-UsingFieldMatcher$addWriteMethod$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 515
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 516
    nop

    .line 513
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$addWriteMethod$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 516
    return-object v0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 392
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 393
    .local v1, "$i$a$-also-UsingFieldMatcher$annotationCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 394
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 395
    nop

    .line 392
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$annotationCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 395
    return-object v0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 438
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 439
    .local v1, "$i$a$-also-UsingFieldMatcher$annotationCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 440
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 441
    nop

    .line 438
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$annotationCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 441
    return-object v0
.end method

.method public final annotationCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 423
    .local v1, "$i$a$-also-UsingFieldMatcher$annotationCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 424
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 425
    nop

    .line 422
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$annotationCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 425
    return-object v0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 407
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 408
    .local v1, "$i$a$-also-UsingFieldMatcher$annotationCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 409
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 410
    nop

    .line 407
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$annotationCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 410
    return-object v0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "annotations"    # Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 365
    .local v1, "$i$a$-also-UsingFieldMatcher$annotations$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 366
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 367
    nop

    .line 364
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$annotations$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 367
    return-object v0
.end method

.method public final declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 278
    .local v1, "$i$a$-also-UsingFieldMatcher$declaredClass$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 279
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 280
    nop

    .line 277
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$declaredClass$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 280
    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 300
    .local v1, "$i$a$-also-UsingFieldMatcher$declaredClass$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 301
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 302
    nop

    .line 299
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$declaredClass$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 302
    return-object v0
.end method

.method public final declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "declaredClass"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "declaredClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 263
    .local v1, "$i$a$-also-UsingFieldMatcher$declaredClass$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 264
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 265
    nop

    .line 262
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$declaredClass$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 265
    return-object v0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 9
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    move-object v6, p0

    check-cast v6, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v6, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v7, 0x0

    .line 174
    .local v7, "$i$a$-also-UsingFieldMatcher$descriptor$1":I
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 175
    .local v8, "dexField":Lorg/luckypray/dexkit/wrap/DexField;
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 176
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 177
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 178
    nop

    .line 173
    .end local v6    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v7    # "$i$a$-also-UsingFieldMatcher$descriptor$1":I
    .end local v8    # "dexField":Lorg/luckypray/dexkit/wrap/DexField;
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 178
    return-object v0
.end method

.method public final field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 148
    .local v1, "$i$a$-also-UsingFieldMatcher$field$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 149
    nop

    .line 147
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$field$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 149
    return-object v0
.end method

.method public final synthetic getDeclaredClass()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 117
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final synthetic getDescriptor()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 68
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 39
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object v0
.end method

.method public final synthetic getModifiers()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 101
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final synthetic getName()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 82
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final synthetic getType()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 133
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getUsingType()Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 1

    .line 46
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 3
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 614
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-eqz v0, :cond_0

    .line 615
    sget-object v0, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;->Companion:Lorg/luckypray/dexkit/schema/-UsingFieldMatcher$Companion;

    .line 616
    nop

    .line 617
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v1, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v1

    .line 618
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/UsingType;->getValue()B

    move-result v2

    .line 615
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-UsingFieldMatcher$Companion;->createUsingFieldMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I

    move-result v0

    .line 620
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 621
    return v0

    .line 614
    .end local v0    # "root":I
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "UsingFieldMatcher matcher not set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "modifiers"    # I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 248
    .local v1, "$i$a$-also-UsingFieldMatcher$modifiers$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 249
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 250
    nop

    .line 247
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$modifiers$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 250
    return-object v0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "modifiers"    # Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    const-string v0, "modifiers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 228
    .local v1, "$i$a$-also-UsingFieldMatcher$modifiers$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 229
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 230
    nop

    .line 227
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$modifiers$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 230
    return-object v0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 213
    .local v1, "$i$a$-also-UsingFieldMatcher$name$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 214
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 215
    nop

    .line 212
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$name$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 215
    return-object v0
.end method

.method public final name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "name"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 191
    .local v1, "$i$a$-also-UsingFieldMatcher$name$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 192
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 193
    nop

    .line 190
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$name$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 193
    return-object v0
.end method

.method public final readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "readMethods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    const-string v0, "readMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 454
    .local v1, "$i$a$-also-UsingFieldMatcher$readMethods$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 455
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 456
    nop

    .line 453
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$readMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 456
    return-object v0
.end method

.method public final synthetic setDeclaredClass(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 121
    return-void
.end method

.method public final synthetic setDescriptor(Ljava/lang/String;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 72
    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 2
    .param p1, "value"    # I

    .line 104
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 105
    return-void
.end method

.method public final synthetic setName(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 86
    return-void
.end method

.method public final synthetic setType(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 137
    return-void
.end method

.method public final synthetic setUsingType(Lorg/luckypray/dexkit/query/enums/UsingType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    return-void
.end method

.method public final type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 328
    .local v1, "$i$a$-also-UsingFieldMatcher$type$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 329
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 330
    nop

    .line 327
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$type$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 330
    return-object v0
.end method

.method public final type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 350
    .local v1, "$i$a$-also-UsingFieldMatcher$type$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 351
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 352
    nop

    .line 349
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$type$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 352
    return-object v0
.end method

.method public final type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "type"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 315
    .local v1, "$i$a$-also-UsingFieldMatcher$type$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 316
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 317
    nop

    .line 314
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$type$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 317
    return-object v0
.end method

.method public final usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 2
    .param p1, "usingType"    # Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v0, "usingType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 160
    .local v1, "$i$a$-also-UsingFieldMatcher$usingType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 161
    nop

    .line 159
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$usingType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 161
    return-object v0
.end method

.method public final writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 3
    .param p1, "putMethods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    const-string v0, "putMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v1, 0x0

    .line 499
    .local v1, "$i$a$-also-UsingFieldMatcher$writeMethods$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 500
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 501
    nop

    .line 498
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v1    # "$i$a$-also-UsingFieldMatcher$writeMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 501
    return-object v0
.end method
