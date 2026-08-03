.class public final Lyj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lyx;


# instance fields
.field public final a:LUi;

.field public final b:Lfj;


# direct methods
.method public constructor <init>(LUi;Lfj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyj;->a:LUi;

    iput-object p2, p0, Lyj;->b:Lfj;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lxj;

    invoke-direct {v0, p0}, Lxj;-><init>(Lyj;)V

    return-object v0
.end method
