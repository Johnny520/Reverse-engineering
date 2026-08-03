.class public final La/ad$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/ad;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/Q6;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/Q6;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ad$a;->a:La/Q6;

    iput-object p2, p0, La/ad$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La/ad$a;->a:La/Q6;

    iget-object v1, p0, La/ad$a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, La/Q6;->a(Ljava/lang/Object;)V

    return-void
.end method
