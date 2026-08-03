.class public final LYue/ۥۢ۠ۢۥ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۡۥ(Ljava/lang/CharSequence;[CIZI)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "Ljava/lang/CharSequence;",
        "Ljava/lang/Integer;",
        "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:[C

.field public final synthetic ۥ۟۟۠ۤ:Z


# direct methods
.method public constructor <init>([CZ)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۠ۢۥ$ۥ۟;->ۥۣ۟۟۠:[C

    iput-boolean p2, p0, LYue/ۥۢ۠ۢۥ$ۥ۟;->ۥ۟۟۠ۤ:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LYue/ۥۢ۠ۢۥ$ۥ۟;->ۥ۟۟(Ljava/lang/CharSequence;I)LYue/ۥۣۡۦ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/CharSequence;I)LYue/ۥۣۡۦ۠;
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢ۠ۢۥ$ۥ۟;->ۥۣ۟۟۠:[C

    iget-boolean v1, p0, LYue/ۥۢ۠ۢۥ$ۥ۟;->ۥ۟۟۠ۤ:Z

    invoke-static {p1, v0, p2, v1}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡ۟(Ljava/lang/CharSequence;[CIZ)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p1

    :goto_0
    return-object p1
.end method
