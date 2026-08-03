.class public final LV0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/h;


# instance fields
.field public final a:LV0/h;

.field public final b:Z

.field public final c:LP0/l;


# direct methods
.method public constructor <init>(LV0/h;ZLP0/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV0/e;->a:LV0/h;

    iput-boolean p2, p0, LV0/e;->b:Z

    iput-object p3, p0, LV0/e;->c:LP0/l;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LV0/d;

    invoke-direct {v0, p0}, LV0/d;-><init>(LV0/e;)V

    return-object v0
.end method
