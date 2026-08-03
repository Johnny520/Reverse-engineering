.class public final synthetic La/Xb;
.super La/S7;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput p6, p0, La/Xb;->i:I

    invoke-direct/range {p0 .. p5}, La/R7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, La/Xb;->i:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/E2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->d()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La/E2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->d()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
