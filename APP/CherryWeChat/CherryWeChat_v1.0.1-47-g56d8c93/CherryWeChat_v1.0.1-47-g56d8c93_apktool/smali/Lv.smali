.class public final synthetic LLv;
.super Lpj;
.source ""

# interfaces
.implements Lfj;


# static fields
.field public static final i:LLv;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LLv;

    const-string v5, "next()Lkotlin/text/MatchResult;"

    sget-object v3, LE6;->a:LE6;

    const/4 v1, 0x1

    const-class v2, Lzq;

    const-string v4, "next"

    invoke-direct/range {v0 .. v5}, Lpj;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LLv;->i:LLv;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzq;

    invoke-virtual {p1}, Lzq;->b()Lzq;

    move-result-object p1

    return-object p1
.end method
