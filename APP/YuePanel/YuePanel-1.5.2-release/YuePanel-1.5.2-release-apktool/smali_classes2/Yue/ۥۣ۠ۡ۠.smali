.class public final synthetic LYue/ۥۣ۠ۡ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ۥ:LYue/ۥ۠ۡ۠ۤ;

.field public final synthetic ۥ۟:LYue/ۥ۠۠ۥۥ;


# direct methods
.method public synthetic constructor <init>(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠ۡ۠;->ۥ:LYue/ۥ۠ۡ۠ۤ;

    iput-object p2, p0, LYue/ۥۣ۠ۡ۠;->ۥ۟:LYue/ۥ۠۠ۥۥ;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠ۡ۠;->ۥ:LYue/ۥ۠ۡ۠ۤ;

    iget-object v1, p0, LYue/ۥۣ۠ۡ۠;->ۥ۟:LYue/ۥ۠۠ۥۥ;

    check-cast p1, LYue/ۥ۠۠ۥۥ;

    invoke-static {v0, v1, p1}, LYue/ۥ۠ۡ۠ۤ;->ۥ(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z

    move-result p1

    return p1
.end method
