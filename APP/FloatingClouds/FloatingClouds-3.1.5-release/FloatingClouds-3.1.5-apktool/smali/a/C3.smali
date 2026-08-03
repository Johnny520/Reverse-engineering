.class public final synthetic La/C3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ac;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/ComponentActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity;I)V
    .locals 0

    iput p2, p0, La/C3;->a:I

    iput-object p1, p0, La/C3;->b:Landroidx/activity/ComponentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/ComponentActivity;)V
    .locals 1

    iget v0, p0, La/C3;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/C3;->b:Landroidx/activity/ComponentActivity;

    check-cast v0, La/X6;

    invoke-static {v0, p1}, La/X6;->d(La/X6;Landroidx/activity/ComponentActivity;)V

    return-void

    :pswitch_0
    iget-object v0, p0, La/C3;->b:Landroidx/activity/ComponentActivity;

    invoke-static {v0, p1}, Landroidx/activity/ComponentActivity;->a(Landroidx/activity/ComponentActivity;Landroidx/activity/ComponentActivity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
