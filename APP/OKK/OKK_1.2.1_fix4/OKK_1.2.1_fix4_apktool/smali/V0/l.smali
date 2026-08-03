.class public final LV0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements LR0/a;


# instance fields
.field public final synthetic a:LV0/h;


# direct methods
.method public constructor <init>(LW0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV0/l;->a:LV0/h;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LV0/l;->a:LV0/h;

    invoke-interface {v0}, LV0/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
