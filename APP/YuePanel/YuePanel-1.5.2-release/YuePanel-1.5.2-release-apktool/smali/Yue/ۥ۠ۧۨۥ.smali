.class public final synthetic LYue/ۥ۠ۧۨۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۧ۠ۧ;


# direct methods
.method public synthetic constructor <init>(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧۨۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧ۠ۧ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧ۠ۧ;

    check-cast p1, Landroid/location/Location;

    invoke-interface {v0, p1}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    return-void
.end method
