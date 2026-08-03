.class public final synthetic Lwa/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lwa/h;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lwa/h;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwa/b;->g:Lwa/h;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwa/b;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lwa/b;->i:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwa/b;->h:Z

    .line 2
    .line 3
    iget-object v1, p0, Lwa/b;->i:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lwa/b;->g:Lwa/h;

    .line 6
    .line 7
    invoke-interface {v2, v1, v0}, Lwa/h;->c(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
