.class public final synthetic LYue/ۥۣۡۦۥ$ۥ;
.super LYue/ۥۣۣ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۦۥ;->getTypeName()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/reflect/Type;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۣۡۦۥ$ۥ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۡۦۥ$ۥ;

    invoke-direct {v0}, LYue/ۥۣۡۦۥ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۣۡۦۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۡۦۥ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, LYue/ۥۢۢۥ۟;

    const-string v3, "typeToString"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥۣۣ۠ۦ;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/reflect/Type;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۦۥ$ۥ;->ۥ۟۟ۡۦ(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۡۦ(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/reflect/Type;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢۢۥ۟;->ۥ۟(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
