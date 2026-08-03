.class public abstract Lj7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LIt;

.field public static final b:LHt;

.field public static final c:Lbn;

.field public static final d:Lan;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-static {v0}, LyD;->b(Ljava/lang/String;)Lz6;

    move-result-object v0

    new-instance v1, LIt;

    const-class v2, Li7;

    invoke-direct {v1, v2}, LIt;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lj7;->a:LIt;

    new-instance v1, LHt;

    invoke-direct {v1, v0}, LHt;-><init>(Lz6;)V

    sput-object v1, Lj7;->b:LHt;

    new-instance v1, Lbn;

    const-class v2, Lf7;

    invoke-direct {v1, v2}, Lbn;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lj7;->c:Lbn;

    new-instance v1, Lr1;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lr1;-><init>(I)V

    new-instance v2, Lan;

    invoke-direct {v2, v0, v1}, Lan;-><init>(Lz6;Lr1;)V

    sput-object v2, Lj7;->d:Lan;

    return-void
.end method
