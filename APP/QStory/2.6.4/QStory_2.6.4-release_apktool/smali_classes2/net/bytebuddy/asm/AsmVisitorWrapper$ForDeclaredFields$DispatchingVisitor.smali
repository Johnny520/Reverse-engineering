.class public Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DispatchingVisitor"
.end annotation


# instance fields
.field private final fields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field final synthetic this$0:Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor;->this$0:Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;

    .line 2
    .line 3
    sget p1, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 6
    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor;->fields:Ljava/util/Map;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p4, p0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor;->fields:Ljava/util/Map;

    .line 6
    .line 7
    new-instance p5, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    iget-object p3, p0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor;->this$0:Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;

    .line 33
    .line 34
    invoke-static {p3}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;->access$000(Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    if-eqz p4, :cond_1

    .line 47
    .line 48
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    check-cast p4, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$Entry;

    .line 53
    .line 54
    invoke-virtual {p4, p2}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$Entry;->matches(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Z

    .line 55
    .line 56
    .line 57
    move-result p5

    .line 58
    if-eqz p5, :cond_0

    .line 59
    .line 60
    iget-object p5, p0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 61
    .line 62
    invoke-virtual {p4, p5, p2, p1}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$Entry;->wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;Lnet/bytebuddy/jar/asm/FieldVisitor;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-object p1
.end method
