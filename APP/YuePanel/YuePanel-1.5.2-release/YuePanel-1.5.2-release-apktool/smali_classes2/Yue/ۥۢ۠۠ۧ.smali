.class public final synthetic LYue/ۥۢ۠۠ۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ۥ:LYue/ۥۡۨۢ;


# direct methods
.method public synthetic constructor <init>(LYue/ۥۡۨۢ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۠۠ۧ;->ۥ:LYue/ۥۡۨۢ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠۠ۧ;->ۥ:LYue/ۥۡۨۢ;

    invoke-static {v0}, LYue/ۥۢ۠۠ۨ;->ۥ(LYue/ۥۡۨۢ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method
