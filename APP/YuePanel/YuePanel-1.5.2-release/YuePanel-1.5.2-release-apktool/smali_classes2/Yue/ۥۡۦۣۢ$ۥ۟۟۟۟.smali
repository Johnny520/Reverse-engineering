.class public final LYue/ۥۡۦۣۢ$ۥ۟۟۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۣۢ;->ۥ۟۟۟ۡ()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "LYue/\u06e5\u06e1\u06e6\u06e3\u06e5;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, LYue/ۥۡۦۣۢ$ۥ۟۟۟۟;->ۥ۟۟(Ljava/lang/Enum;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Enum;)Ljava/lang/Boolean;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e5;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    iget v0, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    check-cast p1, LYue/ۥ۠ۢۡۨ;

    invoke-interface {p1}, LYue/ۥ۠ۢۡۨ;->getMask()I

    move-result v1

    and-int/2addr v0, v1

    invoke-interface {p1}, LYue/ۥ۠ۢۡۨ;->getValue()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
